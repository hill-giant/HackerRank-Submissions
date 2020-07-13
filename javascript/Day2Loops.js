

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    var vowels = ['a','e','i','o','u'];
    var charArray = Array.from(s);
    
    for (let letter of charArray) {
        if (vowels.indexOf(letter) != -1) {
            console.log(letter);
        }
    }

    for (let letter of charArray) {
        if (vowels.indexOf(letter) == -1) {
            console.log(letter);
        }
    }
}




/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    var vowels = s.match(/[aeiou]/g);
    var consonants = s.match(/[^aeiou]/g);
    var letters = vowels.concat(consonants);
    for (let letter of letters)
    {
        console.log(letter);
    }
}


