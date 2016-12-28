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
		setParameterWindoe();

	}

	public void setParameterWindoe(){
		//this.setSize(WWIDTH, WHEIGHT);
		this.setBounds(100, 100, WWIDTH, WHEIGHT);			//親ウィンドウの表示位置、サイズに合わせて表示するように設定する
		addWindowListener(new MyWindowAdapter());

		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();

		//背景色
		gbc.insets = new Insets(5,5,5,5);
		gbc.gridx=0;gbc.gridy=0;gbc.anchor=GridBagConstraints.EAST;		//ラベル位置の設定
		Label label1 = new Label("Background Color:      ");			//ラベル名
		layout.setConstraints(label1, gbc);								//レイアウトにラベル位置の設定
		Choice back_color = new Choice();								//
		for(int i=0; i<10; i++){										//
			back_color.add(Integer.toString(i));						//チョイスにリストを追加
		}
		back_color.addItemListener(new BackColorItemListener());		//チョイスにリスナーを付加
		gbc.gridx=1;gbc.gridy=0;gbc.anchor=GridBagConstraints.WEST;		//チョイス位置の設定
		layout.setConstraints(back_color, gbc);							//レイアウトにチョイス位置の設定

		//文字色
		gbc.gridx=0;gbc.gridy=1;gbc.anchor=GridBagConstraints.EAST;
		Label label2 = new Label("Font Color:      ");
		layout.setConstraints(label2, gbc);
		Choice font_color = new Choice();
		for(int i=0; i<100; i++){
			font_color.add(Integer.toString(i));
		}
		font_color.addItemListener(new FontColorItemListener());
		gbc.gridx=1;gbc.gridy=1;gbc.anchor=GridBagConstraints.WEST;
		layout.setConstraints(font_color, gbc);

		//フォントサイズ
		gbc.gridx=0;gbc.gridy=2;gbc.anchor=GridBagConstraints.EAST;
		Label label3 = new Label("Font Size:      ");
		layout.setConstraints(label3, gbc);
		Choice font_size = new Choice();
		for(int i=0; i<100; i++){
			font_size.add(Integer.toString(i));
		}
		font_size.addItemListener(new FontSizeItemListener());
		gbc.gridx=1;gbc.gridy=2;gbc.anchor=GridBagConstraints.WEST;
		layout.setConstraints(font_size, gbc);

		//フォント
		gbc.gridx=0;gbc.gridy=3;gbc.anchor=GridBagConstraints.EAST;
		Label label4 = new Label("Font:      ");
		layout.setConstraints(label4, gbc);
		Choice font = new Choice();
		for(int i=0; i<100; i++){
			font.add(Integer.toString(i));
		}
		font.addItemListener(new FontItemListener());
		gbc.gridx=1;gbc.gridy=3;gbc.anchor=GridBagConstraints.WEST;
		layout.setConstraints(font, gbc);


		//ボタンの実装
		gbc.insets = new Insets(50,10,10,10);
		gbc.gridx=2;gbc.gridy=5;gbc.anchor=GridBagConstraints.SOUTH;
		Button button1 = new Button("Default");
		button1.addActionListener(new ButtonActionListener());
		layout.setConstraints(button1, gbc);

		gbc.gridx=3;gbc.gridy=5;gbc.anchor=GridBagConstraints.SOUTH;
		Button button2 = new Button("OK");
		button1.addActionListener(new ButtonActionListener());
		layout.setConstraints(button2, gbc);

		gbc.gridx=4;gbc.gridy=5;gbc.anchor=GridBagConstraints.SOUTH;
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

	//ボタンアクションリスナー
	class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//押されたボタンに応じて実行切り替え

		}
	}

	class MyWindowAdapter extends WindowAdapter {
	    public void windowClosing(WindowEvent e) {
	       System.exit(0);
	    }
	}




	//


}
