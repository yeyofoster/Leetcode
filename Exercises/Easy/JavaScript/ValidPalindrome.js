/**
 * @param {string} s
 * @return {boolean}
 */

// Solution 1
var isPalindrome1 = function (s) {
    s = s.toLowerCase().replace(/[^a-z0-9]/g, '');
    return s === [...s].reverse().join('');
};

// Solution 2
var isPalindrome2 = function (s) {
    s = s.toLowerCase().replace(/[^a-z0-9]/g, '');
    for (let i = 0; i < (s.length - 1) / 2; i++) {
        if (s[i] != s[(s.length - 1) - i]) {
            return false;
        }
    }
};

const input = "A man, a plan, a canal: Panama";

console.time("Execution time");
console.log(`Is "${input}" a valid palindrome?: ${isPalindrome1(input)}`);
console.timeEnd("Execution time");