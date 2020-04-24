import java.util.ArrayList;

import java.util.Scanner;

class Main {

static ArrayList<Integer> sort(ArrayList<Integer> arra, int size){

for (int i = 0; i < arra.size(); i++) {

for (int j = 0; j < arra.size() - i - 1; j++) {

if (arra.get(j) > arra.get(j + 1)) { // if current index is greater than the next

int temp = arra.get(j); // copy into temp

arra.set(j, arra.get(j + 1)); // bring the smallest on front

arra.set(j + 1, temp); // replace with the largest on the smallest previous position

}

}

}

return arra;

}

public static void main(String[] args) {

int n = 5; // size 5 as in requirement

Scanner sc= new Scanner(System.in); // scanner object for input

ArrayList<Integer> arrli = new ArrayList<Integer>(n); // arraylist

int number=0;

System.out.println("Enter 5 elements for array");

for(int i=0;i<n;i++){

number= sc.nextInt(); // input a number

arrli.add(number); // insert into array

}

System.out.println("UNSORTED ARRAY");

for(int i=0;i<n;i++){

System.out.print(arrli.get(i)+ " "); // printing unsorted

}

ArrayList<Integer> temp = new ArrayList<Integer>(n); // temp arraylist for sorted array

temp = sort (arrli,n); // sorted array returned

System.out.println("\nSORTED");

for(int i=0;i<n;i++){

System.out.print(arrli.get(i)+ " ");

}

}

}