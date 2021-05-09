import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Games extends JFrame implements ActionListener
{
	JLabel l[][],lb[],lbs[];
	Font f = new Font("Arial",Font.BOLD,20);
	Font fx = new Font("Arial",Font.BOLD,30);
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t[],t1;
	JButton b[] = new JButton[14];
	JButton bt[][] = new JButton[3][3];
	Container con;
	int[] a=new int[25];
	int[][] c=new int[5][5];
	int[][] s=new int[3][3];
	String p1,p2,ss,pn[];
	int r=0,g=0,k,p,x=0,ffff=0;;
	int as[][],ps[],bs[][][],fs[],su[][][];
	JButton bts[][],btn[],btns[][][];
	JPanel  jp;

	public void setComponents()
	{
		con = getContentPane();
		b[4] = new JButton("BINGO");
		b[5] = new JButton("0 X");
		b[9] = new JButton("S O S");
		b[11] = new JButton("SUDOKU");

		b[5].addActionListener(this);
		b[4].addActionListener(this);
		b[9].addActionListener(this);
		b[11].addActionListener(this);

		con.setLayout(new  GridLayout(4,2));

		con.add(b[4]);
		con.add(b[5]);
		con.add(b[9]);
		con.add(b[11]);
	}

	public void setComponents1()
	{
		con = getContentPane();
		r=1;
		l = new JLabel[5][5];
		lb = new JLabel[28];

		lb[0] = new JLabel("Enter No.");
		for(int j=1;j<12;j++)
		{
			lb[j] = new JLabel();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				l[i][j] = new JLabel();
			}
		}
		int k=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				l[i][j].setText("     "+a[k]);
				k++;
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				l[i][j].setFont(f);
			}
		}
		for(int i=1;i<12;i++)
		{
			lb[i].setFont(f);
		}
		
		t1 = new JTextField();
		b[2] = new JButton("REMOVE");
		b[3] = new JButton("RESET");

		for(int j=2;j<12;j++)
		{
			con.add(lb[j]);
		}

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				con.add(l[i][j]);
			}
		}

		b[2].addActionListener(this);
		b[3].addActionListener(this);

		con.add(lb[0]);
		con.add(t1);
		con.add(lb[1]);
		con.add(b[2]);
		con.add(b[3]);
	
		con.setLayout(new  GridLayout(14,2));
		setSize(450,580);
		
	}	

	public void setComponents2()
	{
		con = getContentPane();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		t = new JTextField[25];
		
		for(int i=0;i<25;i++)
		{
			t[i] = new JTextField(10);
		}
		for(int i=0;i<25;i++)
		{
			t[i].setFont(f);
		}

		b[0] = new JButton("DONE");
		b[1] = new JButton("CLEAR");
		b[8] = new JButton("QUIT");

		b[0].addActionListener(this);
		b[1].addActionListener(this);
		b[8].addActionListener(this);

		con.setLayout(new  GridLayout(6,2));

		for(int i=0;i<25;i++)
		{
			con.add(t[i]);
			
		}
		con.add(l1);
		con.add(l2);
		con.add(b[0]);
		con.add(b[1]);
		con.add(b[8]);

	}

	public void setComponents3()
	{

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j] = 3;
				s[i][j] = 3;
			}
		}
		lb = new JLabel[19];		
		con = getContentPane();
		lb[0] = new JLabel(p1);
		for(int i=1;i<19;i++)
		{
			lb[i] = new JLabel();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				bt[i][j] = new JButton();   
			}
		}
		b[6] = new JButton("CLEAR");
		b[7] = new JButton("QUIT");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				bt[i][j].addActionListener(this);  
			}
		}
		b[6].addActionListener(this);
		b[7].addActionListener(this);

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				bt[i][j].setFont(fx);
			}
		}
		for(int i=0;i<5;i++)
		{
			con.add(lb[i]);
		}
		int z=5;
		for(int i=0;i<3;i++)
		{
			con.add(lb[z]);
			z++;
			for(int j=0;j<3;j++)
			{
				con.add(bt[i][j]);  
			}
			con.add(lb[z]);
			z++;
		}
		for(int i=11;i<16;i++)
		{
			con.add(lb[i]);
		}
		con.add(lb[16]);
		con.add(lb[17]);
		con.add(lb[18]);
		con.add(b[6]);
		con.add(b[7]);

		con.setLayout(new  GridLayout(6,2)); 
		setSize(430,330);   
	}

	public void setComponents4()
	{
		p= Integer.parseInt(JOptionPane.showInputDialog("How many player you are ? "));
		pn = new String[p];
		for(int i=0;i<p;i++)
		{
			pn[i]=JOptionPane.showInputDialog("Enter "+(i+1)+" player name : ");
		}
		k = Integer.parseInt(JOptionPane.showInputDialog("How many row or coulmn U want"));
		as = new int[k][k];
		bs = new int[k][k][8];
		ps = new int[p];
		fs = new int[p];

		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k;j++)
			{
				as[i][j]=9;   
			}
		}
		con = getContentPane();
		bts = new JButton[k][k];	
		btn = new JButton[3];	
		lbs = new JLabel[k]; 
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k;j++)
			{
				bts[i][j] = new JButton();   
			}
		}
		btn[0] = new JButton("SCORE");
		btn[1] = new JButton("RESET");
		btn[2] = new JButton("GAME OVER");
		b[10] = new JButton("QUIT");

		for (int i=0;i<k;i++) 
		{
			lbs[i] = new JLabel();
		}
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k;j++)
			{
				bts[i][j].addActionListener(this);  
			}
		}
		for(int i=0;i<3;i++)
		{
			btn[i].addActionListener(this);  
		}
		b[10].addActionListener(this);
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k;j++)
			{
				con.add(bts[i][j]);  
			}
		}
		for (int i=0;i<(k-4);i++) 
		{
			con.add(lbs[i]);
		}
		for(int i=0;i<3;i++)
		{
			con.add(btn[i]);  
		}
		con.add(b[10]);
		con.setLayout(new  GridLayout(k+1,k)); 
		setSize(500,500);  

	}

	public void setComponents5()
	{
		su = new int[9][9][9];
		btns = new JButton[9][9][9];
		b[12] = new JButton("RESET");
		b[13] = new JButton("QUIT");
		
		for(int ls=0;ls<9;ls=ls+3)
		{
			for (int i=ls;i<(ls+3);i++)
			{
				int k1=ls;
				for (int j=0;j<3;j++)
				{
					btns[i][j][k1]=new JButton();
				}
				k1++;
				for (int j=3;j<6;j++)
				{
					btns[i][j][k1]=new JButton();
				}
				k1++;
				for (int j=6;j<9;j++)
				{
					btns[i][j][k1]=new JButton();
				}
			}
		}

		for(int ls=0;ls<9;ls=ls+3)
		{
			for (int i=ls;i<(ls+3);i++)
			{
				int k1=ls;
				for (int j=0;j<3;j++)
				{
					su[i][j][k1]=0;
				}
				k1++;
				for (int j=3;j<6;j++)
				{
					su[i][j][k1]=0;
				}
				k1++;
				for (int j=6;j<9;j++)
				{
					su[i][j][k1]=0;
				}
			}
		}

		setLayout(null);
		{
			btns[0][0][0].setBounds(50,50,50,50);
			btns[0][1][0].setBounds(100,50,50,50);
			btns[0][2][0].setBounds(150,50,50,50);
			btns[0][3][1].setBounds(210,50,50,50);
			btns[0][4][1].setBounds(260,50,50,50);
			btns[0][5][1].setBounds(310,50,50,50);
			btns[0][6][2].setBounds(370,50,50,50);
			btns[0][7][2].setBounds(420,50,50,50);
			btns[0][8][2].setBounds(470,50,50,50);

			btns[1][0][0].setBounds(50,100,50,50);
			btns[1][1][0].setBounds(100,100,50,50);
			btns[1][2][0].setBounds(150,100,50,50);
			btns[1][3][1].setBounds(210,100,50,50);
			btns[1][4][1].setBounds(260,100,50,50);
			btns[1][5][1].setBounds(310,100,50,50);
			btns[1][6][2].setBounds(370,100,50,50);
			btns[1][7][2].setBounds(420,100,50,50);
			btns[1][8][2].setBounds(470,100,50,50);

			btns[2][0][0].setBounds(50,150,50,50);
			btns[2][1][0].setBounds(100,150,50,50);
			btns[2][2][0].setBounds(150,150,50,50);
			btns[2][3][1].setBounds(210,150,50,50);
			btns[2][4][1].setBounds(260,150,50,50);
			btns[2][5][1].setBounds(310,150,50,50);
			btns[2][6][2].setBounds(370,150,50,50);
			btns[2][7][2].setBounds(420,150,50,50);
			btns[2][8][2].setBounds(470,150,50,50);
		}
		{
			btns[3][0][3].setBounds(50,210,50,50);
			btns[3][1][3].setBounds(100,210,50,50);
			btns[3][2][3].setBounds(150,210,50,50);
			btns[3][3][4].setBounds(210,210,50,50);
			btns[3][4][4].setBounds(260,210,50,50);
			btns[3][5][4].setBounds(310,210,50,50);
			btns[3][6][5].setBounds(370,210,50,50);
			btns[3][7][5].setBounds(420,210,50,50);
			btns[3][8][5].setBounds(470,210,50,50);

			btns[4][0][3].setBounds(50,260,50,50);
			btns[4][1][3].setBounds(100,260,50,50);
			btns[4][2][3].setBounds(150,260,50,50);
			btns[4][3][4].setBounds(210,260,50,50);
			btns[4][4][4].setBounds(260,260,50,50);
			btns[4][5][4].setBounds(310,260,50,50);
			btns[4][6][5].setBounds(370,260,50,50);
			btns[4][7][5].setBounds(420,260,50,50);
			btns[4][8][5].setBounds(470,260,50,50);

			btns[5][0][3].setBounds(50,310,50,50);
			btns[5][1][3].setBounds(100,310,50,50);
			btns[5][2][3].setBounds(150,310,50,50);
			btns[5][3][4].setBounds(210,310,50,50);
			btns[5][4][4].setBounds(260,310,50,50);
			btns[5][5][4].setBounds(310,310,50,50);
			btns[5][6][5].setBounds(370,310,50,50);
			btns[5][7][5].setBounds(420,310,50,50);
			btns[5][8][5].setBounds(470,310,50,50);
		}
		{
			btns[6][0][6].setBounds(50,370,50,50);
			btns[6][1][6].setBounds(100,370,50,50);
			btns[6][2][6].setBounds(150,370,50,50);
			btns[6][3][7].setBounds(210,370,50,50);
			btns[6][4][7].setBounds(260,370,50,50);
			btns[6][5][7].setBounds(310,370,50,50);
			btns[6][6][8].setBounds(370,370,50,50);
			btns[6][7][8].setBounds(420,370,50,50);
			btns[6][8][8].setBounds(470,370,50,50);

			btns[7][0][6].setBounds(50,420,50,50);
			btns[7][1][6].setBounds(100,420,50,50);
			btns[7][2][6].setBounds(150,420,50,50);
			btns[7][3][7].setBounds(210,420,50,50);
			btns[7][4][7].setBounds(260,420,50,50);
			btns[7][5][7].setBounds(310,420,50,50);
			btns[7][6][8].setBounds(370,420,50,50);
			btns[7][7][8].setBounds(420,420,50,50);
			btns[7][8][8].setBounds(470,420,50,50);

			btns[8][0][6].setBounds(50,470,50,50);
			btns[8][1][6].setBounds(100,470,50,50);
			btns[8][2][6].setBounds(150,470,50,50);
			btns[8][3][7].setBounds(210,470,50,50);
			btns[8][4][7].setBounds(260,470,50,50);
			btns[8][5][7].setBounds(310,470,50,50);
			btns[8][6][8].setBounds(370,470,50,50);
			btns[8][7][8].setBounds(420,470,50,50);
			btns[8][8][8].setBounds(470,470,50,50);
		}
		b[12].setBounds(340,535,100,50);
		b[13].setBounds(450,535,100,50);

		for(int ls=0;ls<9;ls=ls+3)
		{
			for (int i=ls;i<(ls+3);i++)
			{
				int k1=ls;
				for (int j=0;j<3;j++)
				{
					btns[i][j][k1].addActionListener(this); 
				}
				k1++;
				for (int j=3;j<6;j++)
				{
					btns[i][j][k1].addActionListener(this);
				}
				k1++;
				for (int j=6;j<9;j++)
				{
					btns[i][j][k1].addActionListener(this);
				}
			}
		}
		b[12].addActionListener(this);
		b[13].addActionListener(this);

		{
			add(btns[0][0][0]);
			add(btns[0][1][0]);
			add(btns[0][2][0]);
			add(btns[0][3][1]);
			add(btns[0][4][1]);
			add(btns[0][5][1]);
			add(btns[0][6][2]);
			add(btns[0][7][2]);
			add(btns[0][8][2]);

			add(btns[1][0][0]);
			add(btns[1][1][0]);
			add(btns[1][2][0]);
			add(btns[1][3][1]);
			add(btns[1][4][1]);
			add(btns[1][5][1]);
			add(btns[1][6][2]);
			add(btns[1][7][2]);
			add(btns[1][8][2]);

			add(btns[2][0][0]);
			add(btns[2][1][0]);
			add(btns[2][2][0]);
			add(btns[2][3][1]);
			add(btns[2][4][1]);
			add(btns[2][5][1]);
			add(btns[2][6][2]);
			add(btns[2][7][2]);
			add(btns[2][8][2]);
		}
		{
			add(btns[3][0][3]);
			add(btns[3][1][3]);
			add(btns[3][2][3]);
			add(btns[3][3][4]);
			add(btns[3][4][4]);
			add(btns[3][5][4]);
			add(btns[3][6][5]);
			add(btns[3][7][5]);
			add(btns[3][8][5]);

			add(btns[4][0][3]);
			add(btns[4][1][3]);
			add(btns[4][2][3]);
			add(btns[4][3][4]);
			add(btns[4][4][4]);
			add(btns[4][5][4]);
			add(btns[4][6][5]);
			add(btns[4][7][5]);
			add(btns[4][8][5]);

			add(btns[5][0][3]);
			add(btns[5][1][3]);
			add(btns[5][2][3]);
			add(btns[5][3][4]);
			add(btns[5][4][4]);
			add(btns[5][5][4]);
			add(btns[5][6][5]);
			add(btns[5][7][5]);
			add(btns[5][8][5]);
		}
		{
			add(btns[6][0][6]);
			add(btns[6][1][6]);
			add(btns[6][2][6]);
			add(btns[6][3][7]);
			add(btns[6][4][7]);
			add(btns[6][5][7]);
			add(btns[6][6][8]);
			add(btns[6][7][8]);
			add(btns[6][8][8]);

			add(btns[7][0][6]);
			add(btns[7][1][6]);
			add(btns[7][2][6]);
			add(btns[7][3][7]);
			add(btns[7][4][7]);
			add(btns[7][5][7]);
			add(btns[7][6][8]);
			add(btns[7][7][8]);
			add(btns[7][8][8]);

			add(btns[8][0][6]);
			add(btns[8][1][6]);
			add(btns[8][2][6]);
			add(btns[8][3][7]);
			add(btns[8][4][7]);
			add(btns[8][5][7]);
			add(btns[8][6][8]);
			add(btns[8][7][8]);
			add(btns[8][8][8]);
		}
		add(b[12]);
		add(b[13]);

		int k2=1,z1,k4=0,ff1=0;
		for(int ls=0;ls<9;ls=ls+3)
		{
			for(int x1=ls;x1<(ls+3);x1++)
			{
				int y1 = (int)(Math.random()*9);
				if(y1<3)
					z1=0+ls;
				else if(y1<6)
					z1=1+ls;
				else
					z1=2+ls;
				String k3=Integer.toString(k2);
				btns[x1][y1][z1].setText(k3);
				su[x1][y1][z1]=k2;
				k2++;
			}
		}
		k2=1;
		for(int ls=0;ls<9;ls=ls+3,k4++)
		{
			for(int y1=ls;y1<(ls+3);y1++)
			{
				ff1=0;
				int x1 = (int)(Math.random()*9);
				if(x1<3)
					z1=0+k4;
				else if(x1<6)
					z1=3+k4;
				else
					z1=6+k4;
				if(z1==0)
				{
					for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
						{
							if(su[i][j][0]==k2)
								ff1=1;
						}
					}
				}
				else if(z1==1)
				{
					for(int i=0;i<3;i++)
					{
						for(int j=3;j<6;j++)
						{
							if(su[i][j][1]==k2)
								ff1=1;
						}
					}
				}
				else if(z1==2)
				{
					for(int i=0;i<3;i++)
					{
						for(int j=6;j<9;j++)
						{
							if(su[i][j][2]==k2)
								ff1=1;
						}
					}
				}
				else if(z1==3)
				{
					for(int i=3;i<6;i++)
					{
						for(int j=0;j<3;j++)
						{
							if(su[i][j][3]==k2)
								ff1=1;
						}
					}
				}
				else if(z1==4)
				{
					for(int i=3;i<6;i++)
					{
						for(int j=3;j<6;j++)
						{
							if(su[i][j][4]==k2)
								ff1=1;
						}
					}
				}
				else if(z1==5)
				{
					for(int i=3;i<6;i++)
					{
						for(int j=6;j<9;j++)
						{
							if(su[i][j][5]==k2)
								ff1=1;
						}
					}
				}
				else if(z1==6)
				{
					for(int i=6;i<9;i++)
					{
						for(int j=0;j<3;j++)
						{
							if(su[i][j][6]==k2)
								ff1=1;
						}
					}
				}
				else if(z1==7)
				{
					for(int i=6;i<9;i++)
					{
						for(int j=3;j<6;j++)
						{
							if(su[i][j][7]==k2)
								ff1=1;
						}
					}
				}
				else if(z1==8)
				{
					for(int i=6;i<9;i++)
					{
						for(int j=6;j<9;j++)
						{
							if(su[i][j][8]==k2)
								ff1=1;
						}
					}
				}

				if(x1<3)
				{
					int k1=0;
					for (int j=0;j<3;j++)
					{
	 					if(su[x1][j][k1]==k2)
	 						ff1=1;
					}
					k1++;
					for (int j=3;j<6;j++)
					{
						if(su[x1][j][k1]==k2)
	 						ff1=1;
					}
					k1++;
					for (int j=6;j<9;j++)
					{
						if(su[x1][j][k1]==k2)
	 						ff1=1;	
					}
				}
				else if(x1<6)
				{
					int k1=3;
					for (int j=0;j<3;j++)
					{
	 					if(su[x1][j][k1]==k2)
	 						ff1=1;
					}
					k1++;
					for (int j=3;j<6;j++)
					{
						if(su[x1][j][k1]==k2)
	 						ff1=1;
					}
					k1++;
					for (int j=6;j<9;j++)
					{
						if(su[x1][j][k1]==k2)
	 						ff1=1;		
					}
				}
				else if(x1<9)
				{
					int k1=6;
					for (int j=0;j<3;j++)
					{
	 					if(su[x1][j][k1]==k2)
	 						ff1=1;
					}
					k1++;
					for (int j=3;j<6;j++)
					{
						if(su[x1][j][k1]==k2)
	 						ff1=1;
					}
					k1++;
					for (int j=6;j<9;j++)
					{
						if(su[x1][j][k1]==k2)
	 						ff1=1;		
					}
				}
				if(y1<3)
				{
					int k1=0;
					for (int j=0;j<3;j++)
					{
	 					if(su[j][y1][k1]==k2)
	 						ff1=1;
					}
					k1+=3;
					for (int j=3;j<6;j++)
					{
						if(su[j][y1][k1]==k2)
	 						ff1=1;
					}
					k1+=3;
					for (int j=6;j<9;j++)
					{
						if(su[j][y1][k1]==k2)
	 						ff1=1;	
					}
				}
				else if(y1<6)
				{
					int k1=0;
					for (int j=0;j<3;j++)
					{
	 					if(su[j][y1][k1]==k2)
	 						ff1=1;
					}
					k1+=3;
					for (int j=3;j<6;j++)
					{
						if(su[j][y1][k1]==k2)
	 						ff1=1;
					}
					k1+=3;
					for (int j=6;j<9;j++)
					{
						if(su[j][y1][k1]==k2)
	 						ff1=1;
					}
				}
				else if(y1<9)
				{
					int k1=0;
					for (int j=0;j<3;j++)
					{
	 					if(su[j][y1][k1]==k2)
	 						ff1=1;
					}
					k1+=3;
					for (int j=3;j<6;j++)
					{
						if(su[j][y1][k1]==k2)
	 						ff1=1;
					}
					k1+=3;
					for (int j=6;j<9;j++)
					{
						if(su[j][y1][k1]==k2)
	 						ff1=1;
					}
				}
				if(ff1==1)
				{
					continue;
				}

				btns[x1][y1][z1].setText(""+k2);
				su[x1][y1][z1]=k2;
				k2++;
			}
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		jp = new JPanel();
        jp.setLayout(new GridLayout(p+4,1));
		
		if(e.getSource() == b[0])
		{
			for(int i=0;i<25;i++)
			{
				if(!(Integer.parseInt(t[i].getText())>0)||!(Integer.parseInt(t[i].getText())<=25))
				{
					setBackground(Color.red);
					JOptionPane.showMessageDialog(this,Integer.parseInt(t[i].getText())+" is not Invalid Formate\nEnter Valid Number");
					
					t[i].setText(null);
				}
			}
			for(int i=0;i<25;i++)
			{
				a[i]=Integer.parseInt(t[i].getText());
			}
			for(int i=0;i<25;i++)
			{
				for(int j=0;j<25;j++)
				{
					if(j==i)
						continue;
					if(a[j]==Integer.parseInt(t[i].getText()))
					{
						JOptionPane.showMessageDialog(this,"You Input "+a[j]+" Maltipal Time\nEnter Valid Number");

						t[i].setText(null);
						t[j].setText(null);
					}
				}
			}
			int k=0;
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					c[i][j] = a[k];
					k++;
				}
			}
			if(r==1)
			{
				//setVisible(false);
		         	//Games f1 = new Games("BINGO");

				for(int i=0;i<5;i++)
				{
					for(int j=0;j<5;j++)
					{
						l[i][j].setText(null);
					}
				}

				k=0;
				for(int i=0;i<5;i++)
				{
					for(int j=0;j<5;j++)
					{
						l[i][j].setText("     "+a[k]);
						k++;
					}
				}
			}
			else
			{
				setComponents1();
			}

			for(int i=0;i<25;i++)
			{
				t[i].setText(null);
			}
		}
		else if(e.getSource() == b[1])
		{
			for(int i=0;i<25;i++)
			{
				t[i].setText(null);
			}
		}

		else if(e.getSource() == b[2])
		{
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(c[i][j]==Integer.parseInt(t1.getText()))
					{
						l[i][j].setText(null);
						l[i][j].setBackground(Color.red);
						c[i][j]=0;
					}
				}
			}
			if(!(Integer.parseInt(t1.getText())>0)||!(Integer.parseInt(t1.getText())<=25))
			{
				JOptionPane.showMessageDialog(this,"Invalid Formate");
				t1.setText(null);
			}
			t1.setText(null);
				
			int win=0;
			if(c[0][0]==0&&c[1][1]==0&&c[2][2]==0&&c[3][3]==0&&c[4][4]==0)
			{
				win++;
			}
			if(c[0][4]==0&&c[1][3]==0&&c[2][2]==0&&c[3][1]==0&&c[4][0]==0)
			{
				win++;
			}
			if(c[0][0]==0&&c[0][1]==0&&c[0][2]==0&&c[0][3]==0&&c[0][4]==0)
			{
				win++;
			}
			if(c[1][0]==0&&c[1][1]==0&&c[1][2]==0&&c[1][3]==0&&c[1][4]==0)
			{
				win++;
			}
			if(c[2][0]==0&&c[2][1]==0&&c[2][2]==0&&c[2][3]==0&&c[2][4]==0)
			{
				win++;
			}
			if(c[3][0]==0&&c[3][1]==0&&c[3][2]==0&&c[3][3]==0&&c[3][4]==0)
			{
				win++;
			}
			if(c[4][0]==0&&c[4][1]==0&&c[4][2]==0&&c[4][3]==0&&c[4][4]==0)
			{
				win++;
			}
			if(c[0][0]==0&&c[1][0]==0&&c[2][0]==0&&c[3][0]==0&&c[4][0]==0)
			{
				win++;
			}
			if(c[0][1]==0&&c[1][1]==0&&c[2][1]==0&&c[3][1]==0&&c[4][1]==0)
			{
				win++;
			}
			if(c[0][2]==0&&c[1][2]==0&&c[2][2]==0&&c[3][2]==0&&c[4][2]==0)
			{
				win++;
			}
			if(c[0][3]==0&&c[1][3]==0&&c[2][3]==0&&c[3][3]==0&&c[4][3]==0)
			{
				win++;
			}
			if(c[0][4]==0&&c[1][4]==0&&c[2][4]==0&&c[3][4]==0&&c[4][4]==0)
			{
				win++;
			}

			if(win==1)
			{
				lb[7].setText("    B");
			}
			if(win==2)
			{
				lb[7].setText("    B");
				lb[8].setText("    I");
			}
			if(win==3)
			{
				lb[7].setText("    B");
				lb[8].setText("    I");
				lb[9].setText("    N");
			}
			if(win==4)
			{
				lb[7].setText("    B");
				lb[8].setText("    I");
				lb[9].setText("    N");
				lb[10].setText("    G");
			}
			if(win>=5)
			{
				lb[7].setText("    B");
				lb[8].setText("    I");
				lb[9].setText("    N");
				lb[10].setText("    G");
				lb[11].setText("    O");
			}

			if(win>4)
			{
				JOptionPane.showMessageDialog(this,"You are Win broooooo");
				setVisible(false);
			        Games f1 = new Games("BINGO");
			}

		}

		else if(e.getSource() == bt[0][0]&&c[0][0]==3)
		{
			if(g%2==0)
			{
				bt[0][0].setText("O");
				s[0][0]=0;
				g++;
				lb[0].setText(p2);
			}
			else
			{
				bt[0][0].setText("X");
				s[0][0]=1;
				g++;
				lb[0].setText(p1);
			}
			c[0][0]=1;
			winner();	
		}
		else if(e.getSource() == bt[0][1]&&c[0][1]==3)
		{
			if(g%2==0)
			{
				bt[0][1].setText("O");
				s[0][1]=0;
				g++;
				lb[0].setText(p2);
			}
			else
			{
				bt[0][1].setText("X");
				s[0][1]=1;
				g++;
				lb[0].setText(p1);
			}
			c[0][1]=1;
			winner();	
		}
		else if(e.getSource() == bt[0][2]&&c[0][2]==3)
		{
			if(g%2==0)
			{
				bt[0][2].setText("O");
				s[0][2]=0;
				g++;
				lb[0].setText(p2);
			}
			else
			{
				bt[0][2].setText("X");
				s[0][2]=1;
				g++;
				lb[0].setText(p1);
			}
			c[0][2]=1;
			winner();	
		}
		else if(e.getSource() == bt[1][0]&&c[1][0]==3)
		{
			if(g%2==0)
			{
				bt[1][0].setText("O");
				s[1][0]=0;
				g++;
				lb[0].setText(p2);
			}
			else
			{
				bt[1][0].setText("X");
				s[1][0]=1;
				g++;
				lb[0].setText(p1);
			}
			c[1][0]=1;
			winner();	
		}
		else if(e.getSource() == bt[1][1]&&c[1][1]==3)
		{
			if(g%2==0)
			{
				bt[1][1].setText("O");
				s[1][1]=0;
				g++;
				lb[0].setText(p2);
			}
			else
			{
				bt[1][1].setText("X");
				s[1][1]=1;
				g++;
				lb[0].setText(p1);
			}
			c[1][1]=1;	
			winner();
		}
		else if(e.getSource() == bt[1][2]&&c[1][2]==3)
		{
			if(g%2==0)
			{
				bt[1][2].setText("O");
				s[1][2]=0;
				g++;
				lb[0].setText(p2);
			}
			else
			{
				bt[1][2].setText("X");
				s[1][2]=1;
				g++;
				lb[0].setText(p1);
			}
			c[1][2]=1;
			winner();	
		}
		else if(e.getSource() == bt[2][0]&&c[2][0]==3)
		{
			if(g%2==0)
			{
				bt[2][0].setText("O");
				s[2][0]=0;
				g++;
				lb[0].setText(p2);
			}
			else
			{
				bt[2][0].setText("X");
				s[2][0]=1;
				g++;
				lb[0].setText(p1);
			}	
			c[2][0]=1;
			winner();
		}
		else if(e.getSource() == bt[2][1]&&c[2][1]==3)
		{
			if(g%2==0)
			{
				bt[2][1].setText("O");
				s[2][1]=0;
				g++;
				lb[0].setText(p2);
			}
			else
			{
				bt[2][1].setText("X");
				s[2][1]=1;
				g++;
				lb[0].setText(p1);
			}	
			c[2][1]=1;
			winner();
		}
		else if(e.getSource() == bt[2][2]&&c[2][2]==3)
		{
			if(g%2==0)
			{
				bt[2][2].setText("O");
				s[2][2]=0;
				g++;
				lb[0].setText(p2);
			}
			else
			{
				bt[2][2].setText("X");
				s[2][2]=1;
				g++;
				lb[0].setText(p1);
			}
			c[2][2]=1;
			winner();	
		}

		else if(e.getSource() == b[11])
		{
			setVisible(false);
			Games f1 = new Games("SUDOKU");
			f1.ffff=1;
			f1.setComponents5();
			f1.setSize(585,630);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(e.getSource() == b[12])
		{
			setVisible(false);
			Games f1 = new Games("SUDOKU");
			f1.ffff=1;
			f1.setComponents5();
			f1.setSize(585,630);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		else if(e.getSource() == b[3])
		{
			setVisible(false);
			Games f1 = new Games("BINGO");
			f1.setComponents2();
			f1.setSize(380,280);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		else if(e.getSource() == b[4])
		{
			setVisible(false);
			Games f1 = new Games("BINGO");
			f1.setComponents2();
			f1.setSize(380,300);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(e.getSource() == b[5])
		{
			setVisible(false);
			Games f1 = new Games("0 X");
			f1.Player();
			f1.setSize(380,330);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		else if(e.getSource() == b[6])
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					c[i][j] = 3;
					s[i][j] = 3;
					bt[i][j].setText(null);
				}
			}
			lb[0].setText(p1);
		}

		else if(e.getSource() == b[7] || e.getSource() == b[8] || e.getSource() == b[10] || e.getSource() == b[13])
		{
			setVisible(false);
			Games f1 = new Games("GAMES");
			f1.setComponents();
			f1.setSize(250,300);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		else if(e.getSource() == b[9])
		{
			setVisible(false);
			Games f1 = new Games("S O S");
			f1.setComponents4();
			f1.setSize(500,500);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		else if(ffff==1)
		{
			for(int ls=0;ls<9;ls=ls+3)
			{
				for (int i=ls;i<(ls+3);i++)
				{
					int k1=ls;
					for (int j=0;j<3;j++)
					{
						if(e.getSource() == btns[i][j][k1])
						{
							int pp=10;
							while(pp>9 || pp<1)
								pp = Integer.parseInt(JOptionPane.showInputDialog("Enter number U want to add "));
							su[i][j][k1]=pp;
							btns[i][j][k1].setText(""+pp);
							winner2();
						}
					}
					k1++;
					for (int j=3;j<6;j++)
					{
						if(e.getSource() == btns[i][j][k1])
						{
							int pp=10;
							while(pp>9 || pp<1)
								pp = Integer.parseInt(JOptionPane.showInputDialog("Enter number U want to add "));
							su[i][j][k1]=pp;
							btns[i][j][k1].setText(""+pp);
							winner2();
						}
					}
					k1++;
					for (int j=6;j<9;j++)
					{
						if(e.getSource() == btns[i][j][k1])
						{
							int pp=10;
							while(pp>9 || pp<1)
								pp = Integer.parseInt(JOptionPane.showInputDialog("Enter number U want to add "));
							su[i][j][k1]=pp;
							btns[i][j][k1].setText(""+pp);
							winner2();
						}
					}
				}
			}
		}

		else if(e.getSource() != btn[0] && e.getSource() != btn[1] && e.getSource() != btn[2])
		{
			for(int i=0;i<k;i++)
			{
				for(int j=0;j<k;j++)
				{
					if(e.getSource() == bts[i][j])
					{
						if(as[i][j]==9)
						{
							if(fs[x]!=1)
							{
								int z = 1;
								char ch = 'z';
								while(z==1)
								{
									ss = JOptionPane.showInputDialog("what "+pn[x]+" want to enter (S or O)");
									ch = ss.charAt(0);
									if(ch=='S'||ch=='s'||ch=='O'||ch=='o')
										z=0;
								}
								if(ch=='S'||ch=='s')
								{
									bts[i][j].setText("S");
									as[i][j]=1;
								}
								if(ch=='O'||ch=='o')
								{
									bts[i][j].setText("O");
									as[i][j]=0;
								}
								fs[x]=1;
							}
							else
							{
								fs[x]=0;
								if(x==(p-1))
									x=0;
								else
									x++;

								int z = 1;
								char ch = 'z';
								while(z==1)
								{
									ss = JOptionPane.showInputDialog("what "+pn[x]+" want to enter (S or O)");
									ch = ss.charAt(0);
									if(ch=='S'||ch=='s'||ch=='O'||ch=='o')
										z=0;
								}
								if(ch=='S'||ch=='s')
								{
									bts[i][j].setText("S");
									as[i][j]=1;
								}
								if(ch=='O'||ch=='o')
								{
									bts[i][j].setText("O");
									as[i][j]=0;
								}
								fs[x]=1;
							}
						}
						else
						{
							int g=0;
							if(as[i][j]==0)
							{
								if(as[i][j-1]==1&&as[i][j+1]==1)
								{
									if(bs[i][j][3]!=1)
									{
										bs[i][j][3]=1;
										bs[i][j-1][3]=1;
										bs[i][j+1][7]=1;
										bts[i][j-1].setText("$");
										bts[i][j].setText("@");
										bts[i][j+1].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i-1][j]==1&&as[i+1][j]==1)
								{
									if(bs[i][j][1]!=1)
									{
										bs[i][j][1]=1;
										bs[i-1][j][5]=1;
										bs[i+1][j][1]=1;
										bts[i-1][j].setText("$");
										bts[i][j].setText("@");
										bts[i+1][j].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i-1][j-1]==1&&as[i+1][j+1]==1)
								{
									if(bs[i][j][0]!=1)
									{
										bs[i][j][0]=1;
										bs[i-1][j-1][4]=1;
										bs[i+1][j+1][0]=1;
										bts[i-1][j-1].setText("$");
										bts[i][j].setText("@");
										bts[i+1][j+1].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i-1][j+1]==1&&as[i+1][j-1]==1)
								{
									if(bs[i][j][2]!=1)
									{
										bs[i][j][2]=1;
										bs[i-1][j+1][6]=1;
										bs[i+1][j-1][2]=1;
										bts[i-1][j+1].setText("$");
										bts[i][j].setText("@");
										bts[i+1][j-1].setText("$");
										ps[x]++;
										g=1;
									}
								}
							}
							if(as[i][j]==1)
							{
								if(as[i-1][j]==0&&as[i-2][j]==1)
								{
									if(bs[i][j][1]!=1)
									{
										bs[i][j][1]=1;
										bs[i-1][j][1]=1;
										bs[i-2][j][5]=1;
										bts[i][j].setText("$");
										bts[i-1][j].setText("@");
										bts[i-2][j].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i-1][j-1]==0&&as[i-2][j-2]==1)
								{
									if(bs[i][j][0]!=1)
									{
										bs[i][j][0]=1;
										bs[i-1][j-1][0]=1;
										bs[i-2][j-2][4]=1;
										bts[i][j].setText("$");
										bts[i-1][j-1].setText("@");
										bts[i-2][j-2].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i][j-1]==0&&as[i][j-2]==1)
								{
									if(bs[i][j][7]!=1)
									{
										bs[i][j][7]=1;
										bs[i][j-1][3]=1;
										bs[i][j-2][3]=1;
										bts[i][j].setText("$");
										bts[i][j-1].setText("@");
										bts[i][j-2].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i+1][j-1]==0&&as[i+2][j-2]==1)
								{
									if(bs[i][j][6]!=1)
									{
										bs[i][j][6]=1;
										bs[i+1][j-1][2]=1;
										bs[i+2][j-2][2]=1;
										bts[i][j].setText("$");
										bts[i+1][j-1].setText("@");
										bts[i+2][j-2].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i+1][j]==0&&as[i+2][j]==1)
								{
									if(bs[i][j][5]!=1)
									{
										bs[i][j][5]=1;
										bs[i+1][j][1]=1;
										bs[i+2][j][1]=1;
										bts[i][j].setText("$");
										bts[i+1][j].setText("@");
										bts[i+2][j].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i+1][j+1]==0&&as[i+2][j+2]==1)
								{
									if(bs[i][j][4]!=1)
									{
										bs[i][j][4]=1;
										bs[i+1][j+1][0]=1;
										bs[i+2][j+2][0]=1;
										bts[i][j].setText("$");
										bts[i+1][j+1].setText("@");
										bts[i+2][j+2].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i][j+1]==0&&as[i][j+2]==1)
								{
									if(bs[i][j][3]!=1)
									{
										bs[i][j][3]=1;
										bs[i][j+1][3]=1;
										bs[i][j+2][7]=1;
										bts[i][j].setText("$");
										bts[i][j+1].setText("@");
										bts[i][j+2].setText("$");
										ps[x]++;
										g=1;
									}
								}
								if(as[i-1][j+1]==0&&as[i-2][j+2]==1)
								{
									if(bs[i][j][2]!=1)
									{
										bs[i][j][2]=1;
										bs[i-1][j+1][2]=1;
										bs[i-2][j+2][6]=1;
										bts[i][j].setText("$");
										bts[i-1][j+1].setText("@");
										bts[i-2][j+2].setText("$");
										ps[x]++;
										g=1;
									}
								}
							}
							if(g==0)
							{
								fs[x]=0;
								if(x==(p-1))
									x=0;
								else
									x++;
								for (int m=0;m<p;m++) 
								{
									jp.add(new JLabel(pn[m]+" = "+ps[m]));
								}
								JOptionPane.showMessageDialog(this,jp,"Players Score",JOptionPane.PLAIN_MESSAGE);
							}
							if(g==1)
								fs[x]=0;
						}
					} 
				}
			}
		}
		else if(e.getSource() == btn[0])
		{
			for (int m=0;m<p;m++) 
			{
				jp.add(new JLabel(pn[m]+" = "+ps[m]));
			}
			JOptionPane.showMessageDialog(this,jp,"Players Score",JOptionPane.PLAIN_MESSAGE);
		}
		else if(e.getSource() == btn[1])
		{
			setVisible(false);
			Games f1 = new Games("S O S");
			f1.setComponents4();
			f1.setSize(500,500);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(e.getSource() == btn[2])
		{
			for (int m=0;m<p;m++) 
			{
				jp.add(new JLabel(pn[m]+" = "+ps[m]));
			}
			jp.add(new JLabel("   "));
			jp.add(new JLabel("   "));
			int max=0,t;
			for(int v=0;v<p;v++)
			{
				if(ps[max]<ps[v])
				{
					t=max;
					max=v;
					v=t;
				}
			}
			jp.add(new JLabel(pn[max]+" is win..........."));
			JOptionPane.showMessageDialog(this,jp,"Players Score",JOptionPane.PLAIN_MESSAGE);
			setVisible(false);
			Games f1 = new Games("S O S");
			f1.setComponents4();
			f1.setSize(500,500);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	}

	public void winner()
	{
		int win = 0;
		String n;
		if(s[0][0]==s[1][1]&&s[1][1]==s[2][2])
			{
				if(s[0][0]==0)
				{
					JOptionPane.showMessageDialog(this,p1+" is Win ");
					win = 1;
				}
				else if(s[0][0]==1)
				{
					JOptionPane.showMessageDialog(this,p2+" is Win ");
					n = p1;
					p1 = p2;
					p2 = n;
					win = 1;
				}
			}
			else if(s[0][2]==s[1][1]&&s[1][1]==s[2][0])
			{
				if(s[0][2]==0)
				{
					JOptionPane.showMessageDialog(this,p1+" is Win ");
					win = 1;
				}
				else if(s[0][2]==1)
				{
					JOptionPane.showMessageDialog(this,p2+" is Win ");
					n = p1;
					p1 = p2;
					p2 = n;
					win = 1;
				}
			}
			else if(s[0][0]==s[0][1]&&s[0][1]==s[0][2])
			{
				if(s[0][0]==0)
				{
					JOptionPane.showMessageDialog(this,p1+" is Win ");
					win = 1;
				}
				else if(s[0][0]==1)
				{
					JOptionPane.showMessageDialog(this,p2+" is Win ");
					n = p1;
					p1 = p2;
					p2 = n;
					win = 1;
				}
			}
			else if(s[1][0]==s[1][1]&&s[1][1]==s[1][2])
			{
				if(s[1][0]==0)
				{
					JOptionPane.showMessageDialog(this,p1+" is Win ");
					win = 1;
				}
				else if(s[1][0]==1)
				{
					JOptionPane.showMessageDialog(this,p2+" is Win ");
					n = p1;
					p1 = p2;
					p2 = n;
					win = 1;
				}
			}
			else if(s[2][0]==s[2][1]&&s[2][1]==s[2][2])
			{
				if(s[2][0]==0)
				{
					JOptionPane.showMessageDialog(this,p1+" is Win ");
					win = 1;
				}
				else if(s[2][0]==1)
				{
					JOptionPane.showMessageDialog(this,p2+" is Win ");
					n = p1;
					p1 = p2;
					p2 = n;
					win = 1;
				}
			}
			else if(s[0][0]==s[1][0]&&s[1][0]==s[2][0])
			{
				if(s[0][0]==0)
				{
					JOptionPane.showMessageDialog(this,p1+" is Win ");
					win = 1;
				}
				else if(s[0][0]==1)
				{
					JOptionPane.showMessageDialog(this,p2+" is Win ");
					n = p1;
					p1 = p2;
					p2 = n;
					win = 1;
				}
			}
			else if(s[0][1]==s[1][1]&&s[1][1]==s[2][1])
			{
				if(s[0][1]==0)
				{
					JOptionPane.showMessageDialog(this,p1+" is Win ");
					win = 1;
				}
				else if(s[0][1]==1)
				{
					JOptionPane.showMessageDialog(this,p2+" is Win ");
					n = p1;
					p1 = p2;
					p2 = n;
					win = 1;
				}
			}
			else if(s[0][2]==s[1][2]&&s[1][2]==s[2][2])
			{
				if(s[0][2]==0)
				{
					JOptionPane.showMessageDialog(this,p1+" is Win ");
					win = 1;
				}
				else if(s[0][2]==1)
				{
					JOptionPane.showMessageDialog(this,p2+" is Win ");
					n = p1;
					p1 = p2;
					p2 = n;
					win = 1;
				}
			}
		int f = 1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(s[i][j]==3)
					f=0;
			}
		}
		
		if(win==1||f==1)
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					c[i][j] = 3;
					s[i][j] = 3;
					g=0;
					bt[i][j].setText(null);
					lb[0].setText(p1);
				}
			}
		}
	}

	public void winner2()
	{
		int sum1=0,ff1=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum1+=su[i][j][0];
			}
		}
		if(sum1!=45)
			ff1=1;
		sum1=0;
		for(int i=0;i<3;i++)
		{
			for(int j=3;j<6;j++)
			{
				sum1+=su[i][j][1];
			}
		}
		if(sum1!=45)
			ff1=1;
		sum1=0;
		for(int i=0;i<3;i++)
		{
			for(int j=6;j<9;j++)
			{
				sum1+=su[i][j][2];
			}
		}
		if(sum1!=45)
			ff1=1;
		sum1=0;
		for(int i=3;i<6;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum1+=su[i][j][3];
			}
		}
		if(sum1!=45)
			ff1=1;
		sum1=0;
		for(int i=3;i<6;i++)
		{
			for(int j=3;j<6;j++)
			{
				sum1+=su[i][j][4];
			}
		}
		if(sum1!=45)
			ff1=1;
		sum1=0;
		for(int i=3;i<6;i++)
		{
			for(int j=6;j<9;j++)
			{
				sum1+=su[i][j][5];
			}
		}
		if(sum1!=45)
			ff1=1;
		sum1=0;
		for(int i=6;i<9;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum1+=su[i][j][6];
			}
		}
		if(sum1!=45)
			ff1=1;
		sum1=0;
		for(int i=6;i<9;i++)
		{
			for(int j=3;j<6;j++)
			{
				sum1+=su[i][j][7];
			}
		}
		if(sum1!=45)
			ff1=1;
		sum1=0;
		for(int i=6;i<9;i++)
		{
			for(int j=6;j<9;j++)
			{
				sum1+=su[i][j][8];
			}
		}
		if(sum1!=45)
			ff1=1;
		sum1=0;
		for(int i=0;i<9;i++)
		{
			sum1=0;
			if(i<3)
			{
				int k1=0;
				for (int j=0;j<3;j++)
				{
		 			sum1+=su[i][j][k1];
				}
				k1++;
				for (int j=3;j<6;j++)
				{
					sum1+=su[i][j][k1];
				}
				k1++;
				for (int j=6;j<9;j++)
				{
					sum1+=su[i][j][k1];	
				}
			}
			else if(i<6)
			{
				int k1=3;
				for (int j=0;j<3;j++)
				{
	 				sum1+=su[i][j][k1];
				}
				k1++;
				for (int j=3;j<6;j++)
				{
					sum1+=su[i][j][k1];
				}
				k1++;
				for (int j=6;j<9;j++)
				{
					sum1+=su[i][j][k1];		
				}
			}
			else if(i<9)
			{
				int k1=6;
				for (int j=0;j<3;j++)
				{
	 				sum1+=su[i][j][k1];
				}
				k1++;
				for (int j=3;j<6;j++)
				{
					sum1+=su[i][j][k1];
				}
				k1++;
				for (int j=6;j<9;j++)
				{
					sum1+=su[i][j][k1];		
				}
			}
			if(sum1!=45)
			{
				ff1=1;
				break;
			}
		}
		for(int i=0;i<9;i++)
		{
			sum1=0;
			if(i<3)
			{
				int k1=0;
				for (int j=0;j<3;j++)
				{
	 				sum1+=su[j][i][k1];
				}
				k1+=3;
				for (int j=3;j<6;j++)
				{
					sum1+=su[j][i][k1];
				}
				k1+=3;
				for (int j=6;j<9;j++)
				{
					sum1+=su[j][i][k1];
				}
			}
			else if(i<6)
			{
				int k1=0;
				for (int j=0;j<3;j++)
				{
	 				sum1+=su[j][i][k1];
				}
				k1+=3;
				for (int j=3;j<6;j++)
				{
					sum1+=su[j][i][k1];
				}
				k1+=3;
				for (int j=6;j<9;j++)
				{
					sum1+=su[j][i][k1];
				}
			}
			else if(i<9)
			{
				int k1=0;
				for (int j=0;j<3;j++)
				{
	 				sum1+=su[j][i][k1];
				}
				k1+=3;
				for (int j=3;j<6;j++)
				{
					sum1+=su[j][i][k1];
				}
				k1+=3;
				for (int j=6;j<9;j++)
				{
					sum1+=su[j][i][k1];
				}
			}
			if(sum1!=45)
			{
				ff1=1;
				break;
			}
		}
		if(ff1==0)
		{
			JOptionPane.showMessageDialog(this,"U R win......");
			setVisible(false);
			Games f1 = new Games("SUDOKU");
			f1.ffff=1;
			f1.setComponents5();
			f1.setSize(585,630);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	public void Player()
	{
		p1 = JOptionPane.showInputDialog("Enter First Player Name");
		p2 = JOptionPane.showInputDialog("Enter Second Player Name");
		setComponents3();	
	}
	
	public Games()
	{}

	public Games(String s)
	{
		super(s);		
	}

	public static void main(String[] args)
	{
		Games f1 = new Games("GAMES");
		f1.setComponents();
		f1.setSize(250,300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}