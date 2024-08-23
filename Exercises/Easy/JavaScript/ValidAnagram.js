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
            if (value > 0) {
                map.set(letter, value - 1);
            } else {
                return false;
            }
        }
        // console.table(map);
        return true;
    }
};

const s = "aacc";
const t = "ccaa";
const result = isAnagram(s, t);
console.log(result);
