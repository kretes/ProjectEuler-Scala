package euler

object Problem9 {

  def solution (sumConstraint: Int): Option[(Int, Int, Int)] = {
    (for (a <- 1 to sumConstraint-2;
         b <- 1 to sumConstraint-2;
         c <- 1 to sumConstraint-2;
         if(a+b+c== sumConstraint);
        if(a*a + b*b == c*c)) yield (a,b,c)).headOption
  }
}

