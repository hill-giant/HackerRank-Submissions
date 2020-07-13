

/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 * 
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
    var matches = 0;
    objects.forEach(function(o) {
        if (o.x == o.y) matches++;
    });

    return matches;
}


