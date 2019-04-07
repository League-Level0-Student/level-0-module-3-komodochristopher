
void setup() {
  size(500, 500);
  background(0, 255, 0);
}


void draw() {



  for (int i=8; i>0; i--) { 


    fill(0, 0, 0);
    if (i%2==0) { 
      fill(255, 0, 0);
    }

    ellipse(200, 200, i*25, i*25);
  }
}