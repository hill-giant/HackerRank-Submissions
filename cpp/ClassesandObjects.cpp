

class Student {
    private:
        int scores[5];
    public:
        void input() {
            for (int i = 0; i < 5; i++)
                cin >> scores[i];
        }
        int calculateTotalScore() {
            int total = 0;
            for (int i : scores)
                total += i;
            return total;
        }
};





class Student {
    private:
        vector<int> scores{vector<int>(5)};
    public:
        void input() {
            for (int i = 0; i < scores.size(); i++)
                cin >> scores[i];
        }
        int calculateTotalScore() {
            int total = 0;
            for (int i : scores)
                total += i;
            return total;
        }
};



