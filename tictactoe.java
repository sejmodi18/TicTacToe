import java.awt.*;
import java.awt.event.*;

class Fdemo extends Frame implements ActionListener{
	
	Button b[]= new Button [9];
	Button b1;
	int k=0,x=8,y=28;
	int a=0;
	int z=0,z1=0,z2=0,z3=0,z4=0,z5=0,z6=0,z7=0,z8=0;
	int l=70;
	
	
	

Fdemo(){
	setLayout(null);
	setVisible(true);
	setSize(800,600);
	setLocation(400,100);
	setBackground(Color.black);
	setForeground(Color.white);
	
	for (int i=1;i<=3;i++){
		
		for (int j=1;j<=3;j++){
			
			b[k]= new Button();
			b[k].setSize(100,100);
			b[k].setLocation(x,y);
			b[k].setFont(new Font("", Font.BOLD,40));
			
			add(b[k]);
			
			b[k].addActionListener(this);
			b[k].setBackground(new Color(255,141,28));
			k++;
			x=x+100;
			
			
	}
	x=8;
	y=y+100;
	
	}
	
	
		b1=new Button("new game");
			b1.setSize(150,40);
			b1.setLocation(500,300);
			b1.setFont(new Font("",Font.BOLD,20));
			b1.setForeground(Color.white);
			
			add(b1);
			b1.addActionListener(this);
	}
	


public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
		for (int i=0;i<=8;i++){
			b[i].setLabel("");
		}
		
		z=0;z1=0;z2=0;z3=0;z4=0;z5=0;z6=0;z7=0;z8=0;	
	
}
if(e.getSource()==b[0] && z==0){
	if(a%2==0){
		b[0].setLabel("o");z++;a++;
	}
	else{
		b[0].setLabel("x");z++;a++;
		
	
}
}
if(e.getSource()==b[1] && z1==0){
	if(a%2==0){
		b[1].setLabel("o");z1++;a++;
	}
	else{
		b[1].setLabel("x");z1++;a++;
		
	
}
}

if(e.getSource()==b[2] && z2==0){
	if(a%2==0){
		b[2].setLabel("o");z2++;a++;
	}
	else{
		b[2].setLabel("x");z2++;a++;
		
	
}
}
if(e.getSource()==b[3] && z3==0){
	if(a%2==0){
		b[3].setLabel("o");z3++;a++;
	}
	else{
		b[3].setLabel("x");z3++;a++;
		
	
}
}
if(e.getSource()==b[4] && z4==0){
	if(a%2==0){
		b[4].setLabel("o");z4++;a++;
	}
	else{
		b[4].setLabel("x");z4++;a++;
		
	
}
}
if(e.getSource()==b[5] && z5==0){
	if(a%2==0){
		b[5].setLabel("o");z5++;a++;
	}
	else{
		b[5].setLabel("x");z5++;a++;
		
	
}
}
if(e.getSource()==b[6] && z6==0){
	if(a%2==0){
		b[6].setLabel("o");z6++;a++;
	}
	else{
		b[6].setLabel("x");z6++;a++;
		
	
}
}
if(e.getSource()==b[7] && z7==0){
	if(a%2==0){
		b[7].setLabel("o");z7++;a++;
	}
	else{
		b[7].setLabel("x");z7++;a++;
		
	
}
}
if(e.getSource()==b[8] && z8==0){
	if(a%2==0){
		b[8].setLabel("o");z8++;a++;
	}
	else{
		b[8].setLabel("x");z8++;a++;
		
	
}
}
Font f = new Font("",Font.BOLD,20);
if(b[0].getLabel()==b[1].getLabel() && b[0].getLabel()==b[2].getLabel()){
	if(b[0].getLabel()=="o"){
		Label p1=new Label("player 1 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
	
	
	if(b[0].getLabel()=="x"){
		Label p1=new Label("player 2 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
} 
if(b[3].getLabel()==b[4].getLabel() && b[3].getLabel()==b[5].getLabel()){
	if(b[3].getLabel()=="o"){
		Label p1=new Label("player 1 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
	
	
	if(b[3].getLabel()=="x"){
		Label p1=new Label("player 2 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
} 
if(b[6].getLabel()==b[7].getLabel() && b[6].getLabel()==b[8].getLabel()){
	if(b[6].getLabel()=="o"){
		Label p1=new Label("player 1 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
	
	
	if(b[6].getLabel()=="x"){
		Label p1=new Label("player 2 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
} 
if(b[0].getLabel()==b[3].getLabel() && b[0].getLabel()==b[6].getLabel()){
	if(b[0].getLabel()=="o"){
		Label p1=new Label("player 1 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
	
	
	if(b[0].getLabel()=="x"){
		Label p1=new Label("player 2 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
} 
if(b[1].getLabel()==b[4].getLabel() && b[1].getLabel()==b[7].getLabel()){
	if(b[1].getLabel()=="o"){
		Label p1=new Label("player 1 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
	
	
	if(b[1].getLabel()=="x"){
		Label p1=new Label("player 2 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
} 
if(b[2].getLabel()==b[5].getLabel() && b[2].getLabel()==b[8].getLabel()){
	if(b[2].getLabel()=="o"){
		Label p1=new Label("player 1 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
	
	
	if(b[2].getLabel()=="x"){
		Label p1=new Label("player 2 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
}
if(b[0].getLabel()==b[4].getLabel() && b[0].getLabel()==b[8].getLabel()){
	if(b[0].getLabel()=="o"){
		Label p1=new Label("player 1 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
	
	
	if(b[0].getLabel()=="x"){
		Label p1=new Label("player 2 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
} 
if(b[2].getLabel()==b[4].getLabel() && b[2].getLabel()==b[6].getLabel()){
	if(b[2].getLabel()=="o"){
		Label p1=new Label("player 1 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
	
	
	if(b[2].getLabel()=="x"){
		Label p1=new Label("player 2 wins");
		p1.setSize(150,50);
		p1.setLocation(320,l);
		p1.setFont(f);
		add(p1);
		l+=50;
	}
}  
}
}

public class tictactoe{

public static void main (String arg[]){
	
Fdemo f= new Fdemo();


}

}
