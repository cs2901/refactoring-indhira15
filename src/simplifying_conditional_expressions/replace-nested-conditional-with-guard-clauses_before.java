public double getPayAmount() {
  double result;
    if(isDead){
        result=deadAmount();
        return result;
        }
    if(isSeparated){
        result=separatedAmount();
        return result;
        }
    if(isRetired){
        result=retiredAmount();
        return result;
        }

    result = normalPayAmount();
  return result;
}