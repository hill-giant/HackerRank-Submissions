awk '{ORS=(NR%2==0) ? "\n" : ";"; print $0}'
