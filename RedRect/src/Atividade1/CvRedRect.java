/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.*; 
import java.awt.event.*;


class CvRedRect extends Canvas 
{ public void paint(Graphics g)
	{ Dimension d = getSize(); 
	int maxX = d.width - 1, maxY = d.height - 1; 
	g.drawString("d.largura = " + d.width, 10, 30); 
	g.drawString("d.altura = " + d.height, 10, 60); 
	g.setColor(Color.red); 
	g.drawRect(0, 0, maxX, maxY);
	}
}
