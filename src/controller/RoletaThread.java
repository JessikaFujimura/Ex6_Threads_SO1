package controller;

import java.util.Random;

import javax.swing.JTextField;

public class RoletaThread extends Thread{
	
	private JTextField roleta;
//	private JTextField roleta2;
//	private JTextField roleta3;
	
	public RoletaThread(JTextField roleta){
		this.roleta = roleta;
//		this.roleta2 = roleta2;
//		this.roleta3 = roleta3;
	}

	@Override
	public void run() {
		girarRoleta();
	}
	
	private void girarRoleta(){
		Random random = new Random();
		for(int i = 1; i<=150; i++){
			String num =Integer.toString(random.nextInt(7) + 1);
			roleta.setText(num);
			try {
				Thread.sleep(20);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	

}
