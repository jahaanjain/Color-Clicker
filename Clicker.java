/*****************************************
 * CSCI 185 Fall 2019
 * Author: Jahaan Jain
 * Date: 12/6/2019
 * Version 0.1
 **************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.util.*;
import java.util.Timer;
//import javax.swing.Timer; 

public class Clicker {
	
	static int interval;
	static Timer timer;
	static int timeLeft1 = 10;
	int points = 0;
	int x = 0;
	
	public void editPoints(boolean y) {
		if (y == true) { // true for increase points
			this.points += 10;
		} else { // false for decrease points
			this.points -= 25;
		}
	}
	
	public static void Counter() {
		String secs = "10";
	    int delay = 1000;
	    int period = 1000;
	    timer = new Timer();
	    interval = Integer.parseInt(secs);
	    System.out.println(secs);
	    timer.scheduleAtFixedRate(new TimerTask() {
	        public void run() {
	            timeLeft1 = setInterval();
	        }
	    }, delay, period);
	}
	
	private static final int setInterval() {
	    if (interval == 1)
	        timer.cancel();
	    return --interval;
	}

	public static void main(String[] args) {

		Color green = new Color(50, 205, 50);
		Color red = new Color(178, 34, 34);
		Random rand = new Random();
		Clicker main = new Clicker();
		
		JOptionPane.showMessageDialog(null, "Color Clicker v0.1\nClick as many green buttons as you can in 60 seconds!"
				+ "\nGreen buttons: +10 points\nRed Buttons: -25 points");
		JFrame game = new JFrame("Color Clicker");
		JPanel mainGame = new JPanel();
		JPanel controlsGame = new JPanel();
		
		controlsGame.setLayout(new GridLayout(1, 3));
		mainGame.setLayout(new GridLayout(3, 3));
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");

		JButton start = new JButton("Start");
		JLabel timerL = new JLabel("Time Left: 10 seconds");
		JLabel pointsL = new JLabel("Points: " + main.points);
		
		mainGame.add(button1);
		mainGame.add(button2);
		mainGame.add(button3);
		mainGame.add(button4);
		mainGame.add(button5);
		mainGame.add(button6);
		mainGame.add(button7);
		mainGame.add(button8);
		mainGame.add(button9);
		button1.setBackground(Color.white);
		button2.setBackground(Color.white);
		button3.setBackground(Color.white);
		button4.setBackground(Color.white);
		button5.setBackground(Color.white);
		button6.setBackground(Color.white);
		button7.setBackground(Color.white);
		button8.setBackground(Color.white);
		button9.setBackground(Color.white);
		System.out.println(button1.getBackground().equals(Color.white));
		
		controlsGame.add(timerL);
		controlsGame.add(start);
		controlsGame.add(pointsL);
		
		start.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
			Counter();
			
			new Timer().scheduleAtFixedRate(new TimerTask() {
			    @Override
			    public void run () {
			    	String timeLeft2 = String.valueOf(timeLeft1);
			    	if (timeLeft1 != 0) {
			    		main.x = 1;
			    		timerL.setText("Time Left: " + timeLeft2 + " seconds");
			    		if (button1.getBackground().equals(Color.white) && (timeLeft1 != 0 && timeLeft1 < 10)) {
							int randomInt = rand.nextInt(2);
							if (randomInt == 0) { button1.setBackground(red); } else { button1.setBackground(green); }
						}
			    		if (button2.getBackground().equals(Color.white) && (timeLeft1 != 0 && timeLeft1 < 10)) {
							int randomInt = rand.nextInt(2);
							if (randomInt == 0) { button2.setBackground(red); } else { button2.setBackground(green); }
						}
			    		if (button3.getBackground().equals(Color.white) && (timeLeft1 != 0 && timeLeft1 < 10)) {
							int randomInt = rand.nextInt(2);
							if (randomInt == 0) { button3.setBackground(red); } else { button3.setBackground(green); }
						}
			    		if (button4.getBackground().equals(Color.white) && (timeLeft1 != 0 && timeLeft1 < 10)) {
							int randomInt = rand.nextInt(2);
							if (randomInt == 0) { button4.setBackground(red); } else { button4.setBackground(green); }
						}
			    		if (button5.getBackground().equals(Color.white) && (timeLeft1 != 0 && timeLeft1 < 10)) {
							int randomInt = rand.nextInt(2);
							if (randomInt == 0) { button5.setBackground(red); } else { button5.setBackground(green); }
						}
			    		if (button6.getBackground().equals(Color.white) && (timeLeft1 != 0 && timeLeft1 < 10)) {
							int randomInt = rand.nextInt(2);
							if (randomInt == 0) { button6.setBackground(red); } else { button6.setBackground(green); }
						}
			    		if (button7.getBackground().equals(Color.white) && (timeLeft1 != 0 && timeLeft1 < 10)) {
							int randomInt = rand.nextInt(2);
							if (randomInt == 0) { button7.setBackground(red); } else { button7.setBackground(green); }
						}
			    		if (button8.getBackground().equals(Color.white) && (timeLeft1 != 0 && timeLeft1 < 10)) {
							int randomInt = rand.nextInt(2);
							if (randomInt == 0) { button8.setBackground(red); } else { button8.setBackground(green); }
						}
			    		if (button9.getBackground().equals(Color.white) && (timeLeft1 != 0 && timeLeft1 < 10)) {
							int randomInt = rand.nextInt(2);
							if (randomInt == 0) { button9.setBackground(red); } else { button9.setBackground(green); }
						}
			    		
			    		try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    		
				    	int randomInt = rand.nextInt(2);
				    	if (randomInt == 1) { button1.setBackground(red); } else { button1.setBackground(green); }
				    	if (randomInt == 1) { button2.setBackground(green); } else { button2.setBackground(red); }
				    	if (randomInt == 1) { button3.setBackground(red); } else { button3.setBackground(green); }
				    	if (randomInt == 1) { button4.setBackground(green); } else { button4.setBackground(red); }
				    	if (randomInt == 1) { button5.setBackground(red); } else { button5.setBackground(green); }
				    	if (randomInt == 1) { button6.setBackground(green); } else { button6.setBackground(red); }
				    	if (randomInt == 1) { button7.setBackground(red); } else { button7.setBackground(green); }
				    	if (randomInt == 1) { button8.setBackground(green); } else { button8.setBackground(red); }
				    	if (randomInt == 1) { button9.setBackground(red); } else { button9.setBackground(green); }
			    		
			    	}
			    	else {
			    		timerL.setText("Times up!");
			    		if (main.x == 1) {
			        		JOptionPane.showMessageDialog(null, "You ended up with " + main.points + " points!");
			        		main.points = 0;
			        		main.x = 0;
			        		System.exit(0);
			    		}
			    		button1.setBackground(Color.white);
			    		button2.setBackground(Color.white);
			    		button3.setBackground(Color.white);
			    		button4.setBackground(Color.white);
			    		button5.setBackground(Color.white);
			    		button6.setBackground(Color.white);
			    		button7.setBackground(Color.white);
			    		button8.setBackground(Color.white);
			    		button9.setBackground(Color.white);
			    	}
			    }
			}, 0, 900);
	 	}});
		
		button1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
    		if (button1.getBackground().equals(red) && (timeLeft1 != 0 && timeLeft1 < 10)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button1.setBackground(red); } else { button1.setBackground(green); }
				main.editPoints(false);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			} else if (button1.getBackground().equals(green)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button1.setBackground(red); } else { button1.setBackground(green); }
				main.editPoints(true);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			}
		}});
		button2.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
    		if (button2.getBackground().equals(red) && (timeLeft1 != 0 && timeLeft1 < 10)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button2.setBackground(red); } else { button2.setBackground(green); }
				main.editPoints(false);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			} else if (button2.getBackground().equals(green)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button2.setBackground(red); } else { button2.setBackground(green); }
				main.editPoints(true);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			}
		}});
		button3.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
    		if (button3.getBackground().equals(red) && (timeLeft1 != 0 && timeLeft1 < 10)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button3.setBackground(red); } else { button3.setBackground(green); }
				main.editPoints(false);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			} else if (button3.getBackground().equals(green)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button3.setBackground(red); } else { button3.setBackground(green); }
				main.editPoints(true);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			}
		}});
		button4.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
    		if (button4.getBackground().equals(red) && (timeLeft1 != 0 && timeLeft1 < 10)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button4.setBackground(red); } else { button4.setBackground(green); }
				main.editPoints(false);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			} else if (button4.getBackground().equals(green)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button4.setBackground(red); } else { button4.setBackground(green); }
				main.editPoints(true);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			}
		}});
		button5.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
    		if (button5.getBackground().equals(red) && (timeLeft1 != 0 && timeLeft1 < 10)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button5.setBackground(red); } else { button5.setBackground(green); }
				main.editPoints(false);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			} else if (button5.getBackground().equals(green)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button5.setBackground(red); } else { button5.setBackground(green); }
				main.editPoints(true);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			}
		}});
		button6.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
    		if (button6.getBackground().equals(red) && (timeLeft1 != 0 && timeLeft1 < 10)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button6.setBackground(red); } else { button6.setBackground(green); }
				main.editPoints(false);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			} else if (button6.getBackground().equals(green)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button6.setBackground(red); } else { button6.setBackground(green); }
				main.editPoints(true);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			}
		}});
		button7.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
    		if (button7.getBackground().equals(red) && (timeLeft1 != 0 && timeLeft1 < 10)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button7.setBackground(red); } else { button7.setBackground(green); }
				main.editPoints(false);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			} else if (button7.getBackground().equals(green)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button7.setBackground(red); } else { button7.setBackground(green); }
				main.editPoints(true);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			}
		}});
		button8.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
    		if (button8.getBackground().equals(red) && (timeLeft1 != 0 && timeLeft1 < 10)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button8.setBackground(red); } else { button8.setBackground(green); }
				main.editPoints(false);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			} else if (button8.getBackground().equals(green)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button8.setBackground(red); } else { button8.setBackground(green); }
				main.editPoints(true);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			}
		}});
		button9.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
    		if (button9.getBackground().equals(red) && (timeLeft1 != 0 && timeLeft1 < 10)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button9.setBackground(red); } else { button9.setBackground(green); }
				main.editPoints(false);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			} else if (button9.getBackground().equals(green)) {
				int randomInt = rand.nextInt(2);
				if (randomInt == 0) { button9.setBackground(red); } else { button9.setBackground(green); }
				main.editPoints(true);
				pointsL.setText("Points: " + main.points);
				System.out.println(main.points);
			}
		}});
		
		
		game.add(mainGame);
		game.add(controlsGame, BorderLayout.SOUTH);
		game.setSize(400,500);
		game.setVisible(true);
		mainGame.setVisible(true);
		controlsGame.setVisible(true);
		game.setDefaultCloseOperation(game.EXIT_ON_CLOSE);
		
	}

}
