public class Solution {
    public int addDigits(int num) {
        return 1+(num-1)%9;
    }
}

/*
  int computeNum = num;
  int sum = 0;

  while (computeNum >= 0) {
  if (computeNum == 0 && sum >= 10) {
  computeNum = sum;
  sum = 0;
  } else if (computeNum == 0 && sum < 10) {
  computeNum = -1;
  } else {
  sum += (computeNum % 10);
  computeNum = computeNum / 10;
  }

  }
  return sum;
*/