import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class DesignUI extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	public void paint(Graphics g)
	{
		g.setColor(Color.black);//--------------------------------------->SetColorOftheRectangle
		g.drawRect(80,80,610,610);//------------------------------------->TopRectangle
		g.drawRect(140,140,490,490);//----------------------------------->MiddleRectangle
		g.drawRect(200,200,370,370);//----------------------------------->SmallRectangle
		g.drawLine(385,80,385,200);//------------------------------------>UpLine
		g.drawLine(385,570,385,690);//----------------------------------->DownLine
		g.drawLine(80,385,200,385);//------------------------------------>LeftLine
		g.drawLine(570,385,690,385);//----------------------------------->RightLine
		
		//Font f=new Font("Arial",Font.BOLD+Font.ITALIC,16);
		//g.setFont(f);
		//g.setColor(Color.blue);
		//g.drawString("9",375,340);
		//g.drawString("MEN'S",325,395);
		//g.drawString("MORRISO",295,445);
	}

		Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b;
		DesignUI()
		{
			
			this.setLayout(null);
//--------------------------------------------------------------------------------------->CreatingPushButtons
			
			b1=new Button("1");b1.setBackground(Color.white);b1.setForeground(Color.white);
			b2=new Button("2");b2.setBackground(Color.white);b2.setForeground(Color.white);
			b3=new Button("3");b3.setBackground(Color.white);b3.setForeground(Color.white);
			b4=new Button("4");b4.setBackground(Color.white);b4.setForeground(Color.white);
			b5=new Button("5");b5.setBackground(Color.white);b5.setForeground(Color.white);
			b6=new Button("6");b6.setBackground(Color.white);b6.setForeground(Color.white);
			b7=new Button("7");b7.setBackground(Color.white);b7.setForeground(Color.white);
			b8=new Button("8");b8.setBackground(Color.white);b8.setForeground(Color.white);
			b9=new Button("9");b9.setBackground(Color.white);b9.setForeground(Color.white);
			b10=new Button("10");b10.setBackground(Color.white);b10.setForeground(Color.white);
			b11=new Button("11");b11.setBackground(Color.white);b11.setForeground(Color.white);
			b12=new Button("12");b12.setBackground(Color.white);b12.setForeground(Color.white);
			b13=new Button("13");b13.setBackground(Color.white);b13.setForeground(Color.white);
			b14=new Button("14");b14.setBackground(Color.white);b14.setForeground(Color.white);
			b15=new Button("15");b15.setBackground(Color.white);b15.setForeground(Color.white);
			b16=new Button("16");b16.setBackground(Color.white);b16.setForeground(Color.white);
			b17=new Button("17");b17.setBackground(Color.white);b17.setForeground(Color.white);
			b18=new Button("18");b18.setBackground(Color.white);b18.setForeground(Color.white);
			b19=new Button("19");b19.setBackground(Color.white);b19.setForeground(Color.white);
			b20=new Button("20");b20.setBackground(Color.white);b20.setForeground(Color.white);
			b21=new Button("21");b21.setBackground(Color.white);b21.setForeground(Color.white);
			b22=new Button("22");b22.setBackground(Color.white);b22.setForeground(Color.white);
			b23=new Button("23");b23.setBackground(Color.white);b23.setForeground(Color.white);
			b24=new Button("24");b24.setBackground(Color.white);b24.setForeground(Color.white);
			
//---------------------------------------------------------------------->setLocationsOfButtonsInTheFrame
			b1.setBounds(70,70,20,20);
			b2.setBounds(375,70,20,20);
			b3.setBounds(680,70,20,20);
			b4.setBounds(130,130,20,20);
			b5.setBounds(375,130,20,20);
			b6.setBounds(620,130,20,20);
			b7.setBounds(190,190,20,20);
			b8.setBounds(375,190,20,20);
			b9.setBounds(560,190,20,20);
			b10.setBounds(70,375,20,20);
			b11.setBounds(130,375,20,20);
			b12.setBounds(190,375,20,20);
			b13.setBounds(560,375,20,20);
			b14.setBounds(620,375,20,20);
			b15.setBounds(680,375,20,20);
			b16.setBounds(190,555,20,20);
			b17.setBounds(375,555,20,20);
			b18.setBounds(560,555,20,20);
			b19.setBounds(130,615,20,20);
			b20.setBounds(375,615,20,20);
			b21.setBounds(620,615,20,20);
			b22.setBounds(70,680,20,20);
			b23.setBounds(375,680,20,20);
			b24.setBounds(680,680,20,20);
//--------------------------------------------------------------------------->addingButtonsToTheFrame
			this.add(b1);
			this.add(b2);
			this.add(b3);
			this.add(b4);
			this.add(b4);
			this.add(b5);
			this.add(b6);
			this.add(b7);
			this.add(b8);
			this.add(b9);
			this.add(b10);
			this.add(b11);
			this.add(b12);
			this.add(b13);
			this.add(b14);
			this.add(b15);
			this.add(b16);
			this.add(b17);
			this.add(b18);
			this.add(b19);
			this.add(b20);
			this.add(b21);
			this.add(b22);
			this.add(b23);
			this.add(b24); 

//------------------------------------------------------------------------->addingActionListenerToTheButtons
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b10.addActionListener(this);
			b11.addActionListener(this);
			b12.addActionListener(this);
			b13.addActionListener(this);
			b14.addActionListener(this);
			b15.addActionListener(this);
			b16.addActionListener(this);
			b17.addActionListener(this);
			b18.addActionListener(this);
			b19.addActionListener(this);
			b20.addActionListener(this);
			b21.addActionListener(this);
			b22.addActionListener(this);
			b23.addActionListener(this);
			b24.addActionListener(this);
//------------------------------------------------------------------------->windowClosingEvent
		addWindowListener(new WindowAdapter()
	  	{
			public void windowClosing(WindowEvent e)
			{
					System.exit(0);
			}
		});
		}
int count=0;
int c=0,p=0,f=0,m=0;
//------------------------------------------------------------------------->gettingActionPerformedEvent
public void actionPerformed(ActionEvent ae)
{
		String str=ae.getActionCommand();
		c = Integer.parseInt(str);

	if(count%2==0&&count<22)//--------------------------------------------->UserOneButtons
	{
		if(ae.getSource()==b1)
		{

				if(b1.getBackground().equals(Color.white))
					{b1.setBackground(Color.red);b1.setForeground(Color.red);m=MillEvent(c);}
				else
					count--;
		}
		else if(ae.getSource()==b2) 
		{
			if(b2.getBackground().equals(Color.white))
				{b2.setBackground(Color.red);b2.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b3)
		{
			if(b3.getBackground().equals(Color.white))
				{b3.setBackground(Color.red);b3.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b4) 
		{
			if(b4.getBackground().equals(Color.white))
				{b4.setBackground(Color.red);b4.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b5) 
		{
			if(b5.getBackground().equals(Color.white))
				{b5.setBackground(Color.red);b5.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b6)
		{
			if(b6.getBackground().equals(Color.white))
				{b6.setBackground(Color.red);b6.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b7) 
		{
			if(b7.getBackground().equals(Color.white))
				{b7.setBackground(Color.red);b7.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b8) 
		{
			if(b8.getBackground().equals(Color.white))
				{b8.setBackground(Color.red);b8.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b9)
		{
			if(b9.getBackground().equals(Color.white))
				{b9.setBackground(Color.red);b9.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b10) 
		{
			if(b10.getBackground().equals(Color.white))
				{b10.setBackground(Color.red);b10.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b11)
		{
			if(b11.getBackground().equals(Color.white))
				{b11.setBackground(Color.red);b11.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b12)
		{
			if(b12.getBackground().equals(Color.white))
				{b12.setBackground(Color.red);b12.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b13)
		{
			if(b13.getBackground().equals(Color.white))
				{b13.setBackground(Color.red);b13.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b14) 
		{
			if(b14.getBackground().equals(Color.white))
				{b14.setBackground(Color.red);b14.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b15)
		{
			if(b15.getBackground().equals(Color.white))
				{b15.setBackground(Color.red);b15.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b16) 
		{
			if(b16.getBackground().equals(Color.white))
				{b16.setBackground(Color.red);b16.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b17)
		{
			if(b17.getBackground().equals(Color.white))
				{b17.setBackground(Color.red);b17.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b18) 
		{
			if(b18.getBackground().equals(Color.white))
				{b18.setBackground(Color.red);b18.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b19)
		{
			if(b19.getBackground().equals(Color.white))
				{b19.setBackground(Color.red);b19.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b20) 
		{
			if(b20.getBackground().equals(Color.white))
				{b20.setBackground(Color.red);b20.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b21)
		{
			if(b21.getBackground().equals(Color.white))
				{b21.setBackground(Color.red);b21.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b22) 
		{
			if(b22.getBackground().equals(Color.white))
				{b22.setBackground(Color.red);b22.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b23)
		{
			if(b23.getBackground().equals(Color.white))
				{b23.setBackground(Color.red);b23.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b24)
		{
			if(b24.getBackground().equals(Color.white))
				{b24.setBackground(Color.red);b24.setForeground(Color.red);m=MillEvent(c);}
			else
				count--;
		}
		count++;
	}

	else if(count<22)//------------------------------------------------------>UserTwoButtons
	{
		if(ae.getSource()==b1) 
		{
			if(b1.getBackground().equals(Color.white))
				{b1.setBackground(Color.green);b1.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b2) 
		{
			if(b2.getBackground().equals(Color.white))
				{b2.setBackground(Color.green);b2.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b3) 
		{
			if(b3.getBackground().equals(Color.white))
				{b3.setBackground(Color.green);b3.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b4)
		{
			if(b4.getBackground().equals(Color.white))
				{b4.setBackground(Color.green);b4.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b5) 
		{
			if(b5.getBackground().equals(Color.white))
				{b5.setBackground(Color.green);b5.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b6) 
		{
			if(b6.getBackground().equals(Color.white))
				{b6.setBackground(Color.green);b6.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b7) 
		{
			if(b7.getBackground().equals(Color.white))
				{b7.setBackground(Color.green);b7.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b8) 
		{
			if(b8.getBackground().equals(Color.white))
				{b8.setBackground(Color.green);b8.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b9)
		{
			if(b9.getBackground().equals(Color.white))
				{b9.setBackground(Color.green);b9.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b10)
		{
			if(b10.getBackground().equals(Color.white))
				{b10.setBackground(Color.green);b10.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b11)
		{
			if(b11.getBackground().equals(Color.white))
				{b11.setBackground(Color.green);b11.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b12)
		{
			if(b12.getBackground().equals(Color.white))
				{b12.setBackground(Color.green);b12.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b13)
		{
			if(b13.getBackground().equals(Color.white))
				{b13.setBackground(Color.green);b13.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b14)
		{
			if(b14.getBackground().equals(Color.white))
				{b14.setBackground(Color.green);b14.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b15)
		{
			if(b15.getBackground().equals(Color.white))
				{b15.setBackground(Color.green);b15.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b16) 
		{
			if(b16.getBackground().equals(Color.white))
				{b16.setBackground(Color.green);b16.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b17)
		{
			if(b17.getBackground().equals(Color.white))
				{b17.setBackground(Color.green);b17.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b18)
		{
			if(b18.getBackground().equals(Color.white))
				{b18.setBackground(Color.green);b18.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b19) 
		{
			if(b19.getBackground().equals(Color.white))
				{b19.setBackground(Color.green);b19.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b20)
		{
			if(b20.getBackground().equals(Color.white))
				{b20.setBackground(Color.green);b20.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b21)
		{
			if(b21.getBackground().equals(Color.white))
				{b21.setBackground(Color.green);b21.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b22)
		{
			if(b22.getBackground().equals(Color.white))
				{b22.setBackground(Color.green);b22.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b23)
		{
			if(b23.getBackground().equals(Color.white))
				{b23.setBackground(Color.green);b23.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		else if(ae.getSource()==b24) 
		{
			if(b24.getBackground().equals(Color.white))
				{b24.setBackground(Color.green);b24.setForeground(Color.green);m=MillEvent(c);}
			else
				count--;
		}
		count=count+1;
	} 
//----------------------------------------------------------------------------------->Movements 
	
		if(count>=22)//-------------------------------------------------------------->UserOneMovements
		{
			if(count==22&&f==0) p=c;
			switch(p)//-------------------------------------------------------------->FromButtonEvent
			{
				case 1:b=b1;break;
				case 2:b=b2;break;
				case 3:b=b3;break;
				case 4:b=b4;break;
				case 5:b=b5;break;
				case 6:b=b6;break;
				case 7:b=b7;break;
				case 8:b=b8;break;
				case 9:b=b9;break;
				case 10:b=b10;break;
				case 11:b=b11;break;
				case 12:b=b12;break;
				case 13:b=b13;break;
				case 14:b=b14;break;
				case 15:b=b15;break;
				case 16:b=b16;break;
				case 17:b=b17;break;
				case 18:b=b18;break;
				case 19:b=b19;break;
				case 20:b=b20;break;
				case 21:b=b21;break;
				case 22:b=b22;break;
				case 23:b=b23;break;
				case 24:b=b24;break;
			}
			
			if(p!=0&&count%2==0&&!b.getBackground().equals(Color.white)&&c!=p)
			{
				
				switch(c)
				{
					case 1:
						if(p==2||p==10)
						if(b1.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b1.setBackground(Color.red);b1.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 2:
						if(p==1||p==3||p==5)
						if(b2.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b2.setBackground(Color.red);b2.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 3:
						if(p==15||p==2)
						if(b3.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b3.setBackground(Color.red);b3.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						
						break;
					case 4:
						if(p==5||p==11)
						if(b4.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b4.setBackground(Color.red);b4.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						
						break;
					case 5:
						if(p==2||p==4||p==6||p==8)
						if(b5.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b5.setBackground(Color.red);b5.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						
						break;
					case 6:
						if(p==5||p==14)
						if(b6.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b6.setBackground(Color.red);b6.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 7:
						if(p==12||p==8)
						if(b7.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b7.setBackground(Color.red);b7.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 8:
						if(p==7||p==9||p==5)
						if(b8.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b8.setBackground(Color.red);b8.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 9:
						if(p==8||p==13)
						if(b9.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b9.setBackground(Color.red);b9.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 10:
						if(p==1||p==11||p==22)
						if(b10.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b10.setBackground(Color.red);b10.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 11:
						if(p==4||p==10||p==12||p==19)
						if(b11.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b11.setBackground(Color.red);b11.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 12:
						if(p==7||p==16||p==11)
						if(b12.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b12.setBackground(Color.red);b12.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 13:
						if(p==9||p==14||p==18)
						if(b13.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b13.setBackground(Color.red);b13.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 14:
						if(p==6||p==15||p==21||p==13)
						if(b14.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b14.setBackground(Color.red);b14.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 15:
						if(p==3||p==14||p==24)
						if(b15.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b15.setBackground(Color.red);b15.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 16:
						if(p==12||p==17)
						if(b16.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b16.setBackground(Color.red);b16.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 17:
						if(p==16||p==18||p==20)
						if(b17.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b17.setBackground(Color.red);b17.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 18:
						if(p==13||p==17)
						if(b18.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b18.setBackground(Color.red);b18.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 19:
						if(p==20||p==11)
						if(b19.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b19.setBackground(Color.red);b19.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 20:
						if(p==17||p==19||p==21||p==23)
						if(b20.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b20.setBackground(Color.red);b20.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 21:
						if(p==20||p==14)
						if(b21.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b21.setBackground(Color.red);b21.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 22:
						if(p==10||p==23)
						if(b22.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b22.setBackground(Color.red);b22.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 23:
						if(p==20||p==22||p==24)
						if(b23.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b23.setBackground(Color.red);b23.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 24:
						if(p==15||p==23)
						if(b24.getBackground().equals(Color.white)&&b.getBackground().equals(Color.red))
						{
							b24.setBackground(Color.red);b24.setForeground(Color.red);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;	
						
				}
				p=0;
			}
			else if(p!=0&&count%2==1&&c!=p&&!b.getBackground().equals(Color.white))
			{
				
				switch(c)
				{
					case 1:
						if(p==2||p==10)
						if(b1.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b1.setBackground(Color.green);b1.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}
						break;
					case 2:
						if(p==1||p==3||p==5)
						if(b2.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b2.setBackground(Color.green);b2.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 3:
						if(p==15||p==2)
						if(b3.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b3.setBackground(Color.green);b3.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 4:
						if(p==5||p==11)
						if(b4.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b4.setBackground(Color.green);b4.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 5:
						if(p==2||p==4||p==6||p==8)
						if(b5.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b5.setBackground(Color.green);b5.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 6:
						if(p==5||p==14)
						if(b6.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b6.setBackground(Color.green);b6.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 7:
						if(p==12||p==8)
						if(b7.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b7.setBackground(Color.green);b7.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 8:
						if(p==7||p==9||p==5)
						if(b8.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b8.setBackground(Color.green);b8.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 9:
						if(p==8||p==13)
						if(b9.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b9.setBackground(Color.green);b9.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 10:
						if(p==1||p==11||p==22)
						if(b10.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b10.setBackground(Color.green);b10.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 11:
						if(p==4||p==10||p==12||p==19)
						if(b11.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b11.setBackground(Color.green);b11.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 12:
						if(p==7||p==16||p==11)
						if(b12.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b12.setBackground(Color.green);b12.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 13:
						if(p==9||p==14||p==18)
						if(b13.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b13.setBackground(Color.green);b13.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 14:
						if(p==6||p==15||p==21||p==13)
						if(b14.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b14.setBackground(Color.green);b14.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 15:
						if(p==3||p==14||p==24)
						if(b15.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b15.setBackground(Color.green);b15.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 16:
						if(p==12||p==17)
						if(b16.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b16.setBackground(Color.green);b16.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 17:
						if(p==16||p==18||p==20)
						if(b17.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b17.setBackground(Color.green);b17.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 18:
						if(p==13||p==17)
						if(b18.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b18.setBackground(Color.green);b18.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 19:
						if(p==20||p==11)
						if(b19.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b1.setBackground(Color.green);b19.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 20:
						if(p==17||p==19||p==21||p==23)
						if(b20.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b20.setBackground(Color.green);b20.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 21:
						if(p==20||p==14)
						if(b21.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b21.setBackground(Color.green);b21.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 22:
						if(p==10||p==23)
						if(b22.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b22.setBackground(Color.green);b22.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 23:
						if(p==20||p==22||p==24)
						if(b23.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b23.setBackground(Color.green);b23.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;
					case 24:
						if(p==15||p==23)
						if(b24.getBackground().equals(Color.white)&&b.getBackground().equals(Color.green))
						{
							b24.setBackground(Color.green);b24.setForeground(Color.green);
							b.setBackground(Color.white);b.setForeground(Color.white);
							m=MillEvent(c);
							count++;
						}break;	
				}
				p=0;
			}
			else if(b.getBackground().equals(Color.green)&&count==22&&f==0)
				{p=0;f=1;}
			else
				p=c;
			System.out.println("p="+p);
			System.out.println("c="+c);
			
			
		}
	
		if(m==1)
		{
				
		}
}
//--------------------------------------------------------------------------------------->MillingEvents
 public int MillEvent(int c)
 {
	 int f=0;
      switch(c){
      
      			case 1: case 2: case 3:
      					if(b1.getBackground().equals(b2.getBackground())&&b2.getBackground().equals(b3.getBackground()))
      					{ f=1;}
      					break;
      			case 4: case 5: case 6:
      				if(b4.getBackground().equals(b5.getBackground())&&b5.getBackground().equals(b6.getBackground()))
      					{ f=1;}
      				break;
      			case 7: case 8: case 9:
      				if(b7.getBackground().equals(b8.getBackground())&&b8.getBackground().equals(b9.getBackground()))
      					{ f=1;}
      				break;
      			case 10: case 11: case 12:
      				if(b10.getBackground().equals(b11.getBackground())&&b11.getBackground().equals(b12.getBackground()))
      				{ f=1;}
      				break;
      			case 13: case 14: case 15:
      				if(b13.getBackground().equals(b14.getBackground())&&b14.getBackground().equals(b15.getBackground()))
      				{ f=1;}
      				break;
      			case 16: case 17: case 18:
      				if(b16.getBackground().equals(b17.getBackground())&&b17.getBackground().equals(b18.getBackground()))
      				{ f=1;}
      				break;
      			case 19: case 20: case 21:
      				if(b19.getBackground().equals(b20.getBackground())&&b20.getBackground().equals(b21.getBackground()))
      				{ f=1;}
      				break;
      			case 22: case 23: case 24:
      				if(b22.getBackground().equals(b23.getBackground())&&b23.getBackground().equals(b24.getBackground()))
      				{ f=1;}
      				break;
      }
      if(f!=1)
      {
    	  switch(c)
    	  {
    	  case 1: case 10: case 22:
    		  if(b1.getBackground().equals(b10.getBackground())&&b10.getBackground().equals(b22.getBackground()))
    		  { f=1;}
    		  break;
    	  case 4: case 11: case 19:
    		 if(b4.getBackground().equals(b11.getBackground())&&b11.getBackground().equals(b19.getBackground()))
    		 { f=1;}
    		 break;
    	  case 7: case 12: case 16: 
    		if(b7.getBackground().equals(b12.getBackground())&&b12.getBackground().equals(b16.getBackground()))
    		{ f=1;}
    		break;
    	  case 17: case 20: case 23:
    		 if(b17.getBackground().equals(b20.getBackground())&&b20.getBackground().equals(b23.getBackground()))
    		 { f=1;}
    		 break;
    	  case 2: case 5: case 8:
    		if(b2.getBackground().equals(b5.getBackground())&&b5.getBackground().equals(b8.getBackground()))
    		{ f=1;}
    		break;
    	  case 9: case 13: case 18:
    		if(b9.getBackground().equals(b13.getBackground())&&b13.getBackground().equals(b18.getBackground()))
    		{ f=1;}
    		break;
    	  case 6: case 14: case 21:
    		if(b6.getBackground().equals(b14.getBackground())&&b14.getBackground().equals(b21.getBackground()))
    		{ f=1;}
    		break;
    	  case 3: case 15: case 24:
    		if(b3.getBackground().equals(b15.getBackground())&&b15.getBackground().equals(b24.getBackground()))
    		{ f=1;} 	  
    	  }
      }
      return f;

 }
	
}