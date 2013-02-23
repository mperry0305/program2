import java.util*;

public class Mandelbrot1(){
  
  Scanner input = new Scanner(System.in);
  private int
      gridSize;
      xMin;
      yMin;
      sideLength;
  
  System.out.println('Enter gridSize...');
  gridSize = input.nextInt();
  
  System.out.println('Enter xMin...');
  xMin = input.nextInt();

  System.out.println('Enter sideLength...');
  sideLength = input.nextInt();
