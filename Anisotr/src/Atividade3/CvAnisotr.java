/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class CvAnisotr extends Canvas {
	int maxX, maxY;
	float pixelWidth, pixelHeight, rWidth = 10.0F, rHeight = 7.5F, xP = -1, yP;

	CvAnisotr() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				xP = fx(evt.getX());
				yP = fy(evt.getY());
				repaint();
			}
		});
	}

	void initgr() {
		Dimension d = getSize();
		maxX = d.width - 1;
		maxY = d.height - 1;
		pixelWidth = rWidth / maxX;
		pixelHeight = rHeight / maxY;
	}

	int iX(float x) {
		return Math.round(x / pixelWidth);
	}

	int iY(float y) {
		return maxY - Math.round(y / pixelHeight);
	}

	float fx(int x) {
		return x * pixelWidth;
	}

	float fy(int y) {
		return (maxY - y) * pixelHeight;
	}

	public void paint(Graphics g) {
		initgr();
		int left = iX(0), right = iX(rWidth), bottom = iY(0), top = iY(rHeight);
		if (xP >= 0)
			g.drawString("Coordenadas lógicas do ponto selecionado: " + xP + " " + yP, 20, 100);
		g.setColor(Color.red);
		g.drawLine(left, bottom, right, bottom);
		g.drawLine(right, bottom, right, top);
		g.drawLine(right, top, left, top);
		g.drawLine(left, top, left, bottom);
	}
}
