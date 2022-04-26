class ATM{
    public int countBanknotes(int sum){
        int count = 0;
        int newSum = 0;
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int index = 0;
        while (index < banknotes.length) {
           int countOneBanknotes = 0;
           countOneBanknotes = (sum - newSum)/banknotes[index];
           newSum += countOneBanknotes*banknotes[index];
           count += countOneBanknotes;
           index++;
        }
      return count;
    }
}