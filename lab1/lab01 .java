Problem 1:
(i)
 A B + C D + *
  
(ii)
 A B C + * D *
  
(iii)
 A B * C D + + E G + *
  
(iv)
 A B + C + A B C * + *
Problem 2:
  s.push(4)
   4
  ----
  s.push(3)
   4
   3
  ----
  //then we meet a +
  s.push(s.pop() + s.pop())
   7
  ----
  s.push(2)
   7
   2
  ----
  //then we meet a *
  s.push(s.pop() + s.pop())
   14
  ----
  s.push(2)
   14
   2
  ----
  s.push(3)
   14
   2
   3
  ----
  //then we meet a +
  s.push(s.pop() +s.pop())
   14
   5
  ----
  //at last we meet another +
   s.puh(s.pop() +())
   19
  ----
  after all the steps, the result is 19
 
Problem 3:
 
Problem 4:
if we have already have 
  
Problem 5:
  