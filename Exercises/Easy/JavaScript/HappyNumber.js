/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function (n) {
    let seenNumbers = new Set();
    while (n > 1) {
        seenNumbers.add(n);
        let sumSquares = sumOfSquares(n);

        if (seenNumbers.has(sumSquares)) {
            return false;
        }
        n = sumSquares;
    }
    return true;
};

/**
 * @param {number} n
 * @return {number}
 */
var sumOfSquares = function (n) {
    var sum = 0;
    var currentDigit = 0;

    while (n > 0) {
        currentDigit = n % 10;
        sum += currentDigit * currentDigit;
        n = Number.parseInt(n / 10);
    }
    return sum;
};

const input = 19;

console.time("Execution time");
console.log(`Is ${input} a happy number?: ${isHappy(input)}`);
console.timeEnd("Execution time");