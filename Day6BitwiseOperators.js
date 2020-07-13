
function getMaxLessThanK(n,k) {
    var max = 0;
    var values = Array(n).fill(1)
                    .map((i,j) => i + j);
    for (var i = 0; i < values.length; i++) {
        for (var j = i + 1; j < values.length; j++) {
            var band = values[i] & values[j];
            if (band < k && band > max) {
                max = band;
            }
        }
    }
    return max;
}

