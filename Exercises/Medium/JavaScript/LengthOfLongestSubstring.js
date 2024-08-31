/**
 * LeetCode 
 * 3. Longest Substring Without Repeating Characters
 */

/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
    let letters = new Set();
    let left = 0;
    let longest = 0;

    for (let right = 0; right < s.length; right++) {
        while (letters.has(s[right])) {
            letters.delete(s[left]);
            left++;
        }
        letters.add(s[right]);
        longest = Math.max(longest, letters.size);
    }
    return longest;
};

// const input = "abcabcbb";
// const input = "bbbbb";
const input = "pwwkew";

const length = lengthOfLongestSubstring(input);
console.log(`The length of longest substring in "${input}" is: ${length}`);