/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function (n) {
    let seenNumbers = new Map();
    let currentDigit = 0;
    while (!seenNumbers.has(n)) {
        seenNumbers.set(n, n);
        let numString = n.toString();
        let sumSquares = 0;
        for (let i = 0; i < numString.length; i++) {
            currentDigit = Number.parseInt(numString.charAt(i));
            sumSquares += currentDigit * currentDigit;
        }
        console.table(seenNumbers);
        if (sumSquares === 1) {
            return true;
        }
        n = sumSquares;
    }

    return false;
};

const input = 23;

console.time("isHappy");
console.log(`Is ${input} a happy number?: ${isHappy(input)}`);
console.timeEnd("isHappy");