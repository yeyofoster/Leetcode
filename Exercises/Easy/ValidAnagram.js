/* spellchecker: disable */
var isAnagram = function (s, t) {
    if (s.length !== t.length) {
        return false;
    } else {
        let map = new Map();
        for (const letter of s) {
            if (map.has(letter)) {
                map.set(letter, map.get(letter) + 1);
            } else {
                map.set(letter, 1);
            }
        }
        // console.table(map);

        for (const letter of t) {
            const value = map.get(letter);
            // console.log(letter, value);
            if (value > 1) {
                map.set(letter, value - 1);
            } else if (value === 1) {
                map.delete(letter);
            } else {
                return false;
            }
        }
        // console.table(map);
        return map.size === 0;
    }
};

const s = "aacc";
const t = "ccaa";
const result = isAnagram(s, t);
console.log(result);
