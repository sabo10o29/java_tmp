package Clock_tmp;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ParameterWindow extends Frame{

	private static final int WWIDTH = 	500;
	private static final int WHEIGHT = 	300;

	//
	public static void main(String[] args) {
		ParameterWindow test = new ParameterWindow();

	}

	public ParameterWindow(){
		this.setSize(WWIDTH, WHEIGHT);
		addWindowListener(new MyWindowAdapter());

		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();









		//
		gbc.insets = new Insets(5,5,5,5);
		gbc.gridx=0;gbc.gridy=0;gbc.anchor=GridBagConstraints.EAST;		//ラベル位置の設定
		gbc.weightx=16;gbc.weighty=0;
		Label label1 = new Label("Background Color:      ");			//ラベル名
		layout.setConstraints(label1, gbc);								//レイアウトにラベル位置の設定
		Choice back_color = new Choice();								//
		for(int i=0; i<10; i++){										//
			back_color.add(Integer.toString(i));						//チョイスにリストを追加
		}
		back_color.addItemListener(new BackColorItemListener());		//チョイスにリスナーを付加
		gbc.gridx=1;gbc.gridy=0;gbc.anchor=GridBagConstraints.WEST;		//チョイス位置の設定
		gbc.weightx=0.2;gbc.weighty=0;
		layout.setConstraints(back_color, gbc);							//レイアウトにチョイス位置の設定

		//
		gbc.gridx=0;gbc.gridy=1;gbc.anchor=GridBagConstraints.EAST;
		gbc.weightx=0;gbc.weighty=0;
		Label label2 = new Label("Font Color:      ");
		layout.setConstraints(label2, gbc);
		Choice font_color = new Choice();
		for(int i=0; i<100; i++){
			font_color.add(Integer.toString(i));
		}
		font_color.addItemListener(new FontColorItemListener());
		gbc.gridx=1;gbc.gridy=1;gbc.anchor=GridBagConstraints.WEST;
		gbc.weightx=0;gbc.weighty=0;
		layout.setConstraints(font_color, gbc);

		//
		gbc.gridx=0;gbc.gridy=2;gbc.anchor=GridBagConstraints.EAST;
		gbc.weightx=0;gbc.weighty=0;
		Label label3 = new Label("Font Size:      ");
		layout.setConstraints(label3, gbc);
		Choice font_size = new Choice();
		for(int i=0; i<100; i++){
			font_size.add(Integer.toString(i));
		}
		font_size.addItemListener(new FontSizeItemListener());
		gbc.gridx=1;gbc.gridy=2;gbc.anchor=GridBagConstraints.WEST;
		gbc.weightx=0;gbc.weighty=0;
		layout.setConstraints(font_size, gbc);

		//
		gbc.gridx=0;gbc.gridy=3;gbc.anchor=GridBagConstraints.EAST;
		gbc.weightx=0;gbc.weighty=0;
		Label label4 = new Label("Font:      ");
		layout.setConstraints(label4, gbc);
		Choice font = new Choice();
		for(int i=0; i<100; i++){
			font.add(Integer.toString(i));
		}
		font.addItemListener(new FontItemListener());
		gbc.gridx=1;gbc.gridy=3;gbc.anchor=GridBagConstraints.WEST;
		gbc.weightx=0;gbc.weighty=0;
		layout.setConstraints(font, gbc);

		//
		gbc.insets = new Insets(50,5,5,5);
		gbc.gridx=2;gbc.gridy=5;gbc.anchor=GridBagConstraints.SOUTH;
		gbc.weightx=0.2;gbc.weighty=0;
		Button button1 = new Button("Initializing");
		button1.addActionListener(new ButtonActionListener());
		layout.setConstraints(button1, gbc);

		gbc.gridx=3;gbc.gridy=5;gbc.anchor=GridBagConstraints.SOUTH;
		gbc.weightx=0.2;gbc.weighty=0;
		Button button2 = new Button("OK");
		button1.addActionListener(new ButtonActionListener());
		layout.setConstraints(button2, gbc);

		gbc.gridx=4;gbc.gridy=5;gbc.anchor=GridBagConstraints.SOUTH;
		gbc.weightx=0.2;gbc.weighty=0;
		Button button3 = new Button("Cancel");
		button1.addActionListener(new ButtonActionListener());
		layout.setConstraints(button3, gbc);


		this.add(label1);
		this.add(back_color);
		this.add(label2);
		this.add(font_color);
		this.add(label3);
		this.add(font_size);
		this.add(label4);
		this.add(font);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.setVisible(true);

	}

	////////内部クラスとしてチョイスのアイテムリスナーとボタンのアクションリスナーを持つ/////////
	//背景色のリスナー
	class BackColorItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println(e.getItem().toString());

		}

	}
	//フォントカラーのリスナー
	class FontColorItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println(e.getItem().toString());

		}

	}
	//フォントのリスナー
	class FontItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println(e.getItem().toString());

		}

	}
	//フォントサイズのリスナー
	class FontSizeItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println(e.getItem().toString());

		}

	}


	class MyWindowAdapter extends WindowAdapter {
	    public void windowClosing(WindowEvent e) {
	       System.exit(0);
	    }
	}


	class ButtonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//押されたボタンに応じて実行切り替え

		}
	}

	//


}
