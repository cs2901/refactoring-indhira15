boolean IsSummer(){
        if(date.before(SUMMER_START) || date.after(SUMMER_END)){
            return false;
        }
        else{
            true;
        }
}


if (!IsSummer()) {
  charge = quantity * winterRate + winterServiceCharge;
}
else {
  charge = quantity * summerRate;
}