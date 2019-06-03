public double getPayAmount() {
  double result;
  if(isDead ||isSeparated || isRetired){
        if(isDead){
        result=deadAmount();
        }
        if(isSeparated){
        result=separatedAmount();
        }
        if(isRetired){
        result=retiredAmount();
        }
  }
  else{
      result = normalPayAmount();
  }


  return result;
}