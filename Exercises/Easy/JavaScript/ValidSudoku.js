// LeetCode - Exercise 36
// Valid Sudoku

var validateNumbers = function (numbers) {
    let numbersSet = new Set();
    for (let i = 0; i < 9; i++) {
        if (numbers[i] == '.') {
            continue;
        } else if (/[^0-9]/.test(numbers[i]) || numbersSet.has(numbers[i])) {
            return false
        } else {
            numbersSet.add(numbers[i]);
        }
    }
    return true;
};

var getColumns = function (board) {
    let columns = [];
    let currentColumn = [];
    for (let i = 0; i < 9; i++) {
        for (let j = 0; j < 9; j++) {
            currentColumn.push(board[j][i]);
        }
        columns.push(currentColumn);
        currentColumn = [];
    }
    return columns;
}

var getSquares = function (board) {
    let squares = [];
    let currentSquare = 0;
    for (let i = 0; i < 9; i++) {
        for (let j = 0; j < 9; j++) {
            currentSquare = (Number.parseInt(i / 3) * 3) + Number.parseInt(j / 3);
            if (squares[currentSquare] != null) {
                squares[currentSquare].push(board[i][j]);
            }
            else {
                squares[currentSquare] = [];
                squares[currentSquare].push(board[i][j]);
            }
        }
    }
    return squares;
}

/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function (board) {
    const columns = getColumns(board);
    const squares = getSquares(board);

    // Validating numbers
    for (let i = 0; i < 9; i++) {
        const isValidRow = validateNumbers(board[i]);
        const isValidColumn = validateNumbers(columns[i]);
        const isValidSquare = validateNumbers(squares[i]);
        if (!isValidRow || !isValidColumn || !isValidSquare) {
            return false;
        }
    }

    return true;
};

const input = [
    ["5", "3", ".", ".", "7", ".", ".", ".", "."],
    ["6", ".", ".", "1", "9", "5", ".", ".", "."],
    [".", "9", "8", ".", ".", ".", ".", "6", "."],
    ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
    ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
    ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
    [".", "6", ".", ".", ".", ".", "2", "8", "."],
    [".", ".", ".", "4", "1", "9", ".", ".", "5"],
    [".", ".", ".", ".", "8", ".", ".", "7", "9"]
];

const result = isValidSudoku(input);
console.table(input);
console.log(`Is previous input a valid sudoku?: ${result}`);
