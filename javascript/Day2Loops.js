

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


