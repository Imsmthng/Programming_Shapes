#include<iostream>
using namespace std;

int num = 0;
void Square_Shape(){
  system("clear");
  cout << "Enter the size of the square: ";
  cin >> num;

  for(int rows = 0; rows < num; rows++){
    for(int cols = 0; cols < num; cols++){
      cout << " * ";
    }
    cout << endl;
  }
}

void Left_Triange(){
  system("clear");
  cout << "Enter the size of Half Triangle: ";
  cin >> num;

  for(int rows = 0; rows < num; rows++){
    for(int cols = 0; cols < rows; cols++){
      cout << " * ";
    }
    cout << endl;
  }
}

int main(){

  int choice = 0;

  cout << "< = = = = = Choose a Shape = = = = >" << endl;
  cout << "[1] Left Triange" << endl;
  cout << "[2] Square"<< endl;
  cout << "Enter your choice: ";
  cin >> choice;

  if(choice = 1){
    Left_Triange();
  }
  else if(choice = 2){
    Square_Shape();
  }
  return 0;
}
