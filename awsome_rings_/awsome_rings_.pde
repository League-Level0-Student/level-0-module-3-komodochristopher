int x1=200;
int x2= 1900;


void setup() {
  size(2000, 1000);

}
void draw() {
  x1++;
    
    x2--; 
  background(0, 200, 0);


  for (int i=10; i>0; i--) { 



    if (i%2==0) {
    }

    ellipse(x1, 200, i*20, i*20);
    noFill();
  }

if(x2<0)    {
}

  for (int i=10; i>0; i--) { 



    if (i%2==0) {
    }

    ellipse(x2, 200, i*20, i*20);
    noFill();
    
  }
}