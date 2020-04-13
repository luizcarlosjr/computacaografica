/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2;

import Atividade2.CvTriangles;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.*;

public class Triangles extends Frame {
	public static void main(String[] args) {
		new Triangles();
	}

	Triangles()

	{
		super("Triângulos: 50 triângulos uns dentro dos outros");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(600, 400);
		add("Center", new CvTriangles());
		show();
	}
}