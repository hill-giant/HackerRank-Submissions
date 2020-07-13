

// The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
function getDayName(dateString) {
    let dayName = (new Date(dateString).toLocaleString('en-us',{weekday: 'long'}));

    return dayName;
}


