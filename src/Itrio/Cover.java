package Itrio;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpRequest;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.mysql.cj.jdbc.Blob;

import bd.Querys;

public class Cover {

    private int horizontal;
    private int vertical;
    private int ancho;
    private int alto;
    private int id;

    public Cover (int horizontal, int vertical, int ancho, int alto, int id) {
		this.horizontal = horizontal;
		this.vertical = vertical;
		this.ancho = ancho;
		this.alto = alto;
		this.id = id;
	}

    public Cover(int id){
        this.id = id;
    }
        
    
}