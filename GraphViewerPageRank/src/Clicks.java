import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import org.graphstream.graph.Graph;

import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.swingViewer.ViewPanel;
import org.graphstream.ui.view.*;

public class Clicks implements ViewerListener {
	Graph graph = new MultiGraph("Page Rank grafo");
	protected boolean loop = true;
	
	 JFrame frame = new JFrame();
	 
	 JPanel panel = new JPanel(new BorderLayout()){ //Panel el cual contendra el grafo
		 
		 @Override
         public Dimension getPreferredSize() {
             return new Dimension(720, 680);
         }
	 };
	 panel2 panel1 = new panel2(); //Panel con los labels y edits

	public static void main(String args[]) {
		new Clicks();
	}
	public Clicks() {
		//Habilitación de la vista compleja de GraphStream
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		graph.addAttribute("ui.stylesheet", "node {fill-color: red; size-mode: dyn-size;} edge {fill-color:silver;}");
		graph.addNode("Google" );
		graph.addNode("Apple" );
		graph.addNode("Youtube" );
		graph.addNode("Blogger" );
		graph.addNode("Microsoft" );
		graph.addNode("Adobe" );
		graph.addNode("wordpress" );
		graph.addNode("wikipedia" );
		graph.addNode("mozilla" );
		graph.addNode("Amazon" );
		graph.addNode("Facebook" );
		graph.addNode("github" );
		graph.addNode("cnn" );
		graph.addNode("buap" );
		graph.addNode("forbes" );
		graph.addNode("w3" );
		graph.addNode("nexusmods" );
		
		graph.addEdge("GoogleApple", "Google", "Apple",true);
		graph.addEdge("GoogleYoutube", "Google", "Youtube",true);
		graph.addEdge("GoogleBlogger", "Google", "Blogger",true);
		graph.addEdge("GoogleMicrosoft", "Google", "Microsoft",true);
		graph.addEdge("GoogleAdobe", "Google", "Adobe",true);
		graph.addEdge("Googlewordpress", "Google", "wordpress",true);
		graph.addEdge("Googlewikipedia", "Google", "wikipedia",true);
		graph.addEdge("Googlemozilla", "Google", "mozilla",true);
		graph.addEdge("GoogleAmazon", "Google", "Amazon",true);
		graph.addEdge("GoogleFacebook", "Google", "Facebook",true);
		graph.addEdge("Googlegithub", "Google", "github",true);
		graph.addEdge("Googlecnn", "Google", "cnn",true);
		graph.addEdge("Googlebuap", "Google", "buap",true);
		graph.addEdge("Googleforbes", "Google", "forbes",true);
		graph.addEdge("Googlew3", "Google", "w3",true);
		graph.addEdge("Googlenexusmods", "Google", "nexusmods",true);
		
		graph.addEdge("AppleYoutube", "Apple", "Youtube",true);
		graph.addEdge("AppleAmazon", "Apple", "Amazon",true);
		graph.addEdge("AppleFacebook", "Apple", "Facebook",true);
		
		graph.addEdge("YoutubeApple", "Youtube", "Apple",true);
		graph.addEdge("YoutubeBlogger", "Youtube", "Blogger",true);
		graph.addEdge("YoutubeMicrosoft", "Youtube", "Microsoft",true);
		graph.addEdge("YoutubeAdobe", "Youtube", "Adobe",true);
		graph.addEdge("Youtubewordpress", "Youtube", "wordpress",true);
		graph.addEdge("Youtubewikipedia", "Youtube", "wikipedia",true);
		graph.addEdge("Youtubemozilla", "Youtube", "mozilla",true);
		graph.addEdge("YoutubeAmazon", "Youtube", "Amazon",true);
		graph.addEdge("YoutubeFacebook", "Youtube", "Facebook",true);
		graph.addEdge("Youtubegithub", "Youtube", "github",true);
		graph.addEdge("Youtubecnn", "Youtube", "cnn",true);
		graph.addEdge("Youtubeforbes", "Youtube", "forbes",true);
		graph.addEdge("Youtubew3", "Youtube", "w3",true);
		graph.addEdge("Youtubenexusmods", "Youtube", "nexusmods",true);
		
		graph.addEdge("BloggerApple", "Blogger", "Apple",true);
		graph.addEdge("BloggerYoutube", "Blogger", "Youtube",true);
		graph.addEdge("Bloggerwordpress", "Blogger", "wordpress",true);
		graph.addEdge("Bloggerwikipedia", "Blogger", "wikipedia",true);
		graph.addEdge("BloggerFacebook", "Blogger", "Facebook",true);
		graph.addEdge("Bloggernexusmods", "Blogger", "nexusmods",true);
		
		graph.addEdge("MicrosoftYoutube", "Microsoft", "Youtube",true);
		graph.addEdge("MicrosoftAdobe", "Microsoft", "Adobe",true);
		graph.addEdge("MicrosoftAmazon", "Microsoft", "Amazon",true);
		
		graph.addEdge("AdobeYoutube", "Adobe", "Youtube",true);
		graph.addEdge("AdobeMicrosoft", "Adobe", "Microsoft",true);
		graph.addEdge("AdobeAmazon", "Adobe", "Amazon",true);
		graph.addEdge("AdobeFacebook", "Adobe", "Facebook",true);
		
		graph.addEdge("wordpressYoutube", "wordpress", "Youtube",true);
		graph.addEdge("wordpressAdobe", "wordpress", "Adobe",true);
		graph.addEdge("wordpressFacebook", "wordpress", "Facebook",true);
		graph.addEdge("wordpressforbes", "wordpress", "forbes",true);
		
		graph.addEdge("wikipediaApple", "wikipedia", "Apple",true);
		graph.addEdge("wikipediaYoutube", "wikipedia", "Youtube",true);
		graph.addEdge("wikipediaMicrosoft", "wikipedia", "Microsoft",true);
		graph.addEdge("wikipediaAdobe", "wikipedia", "Adobe",true);
		graph.addEdge("wikipediamozilla", "wikipedia", "mozilla",true);
		graph.addEdge("wikipediaAmazon", "wikipedia", "Amazon",true);
		graph.addEdge("wikipediaFacebook", "wikipedia", "Facebook",true);
		graph.addEdge("wikipediacnn", "wikipedia", "cnn",true);
		graph.addEdge("wikipediaw3", "wikipedia", "w3",true);
		graph.addEdge("wikipediaforbes", "wikipedia", "forbes",true);
		
		graph.addEdge("mozillaYoutube", "mozilla", "Youtube",true);
		graph.addEdge("mozillaFacebook", "mozilla", "Facebook",true);
		
		graph.addEdge("AmazonApple", "Amazon", "Apple",true);
		graph.addEdge("AmazonYoutube", "Amazon", "Youtube",true);
		graph.addEdge("AmazonAdobe", "Amazon", "Adobe",true);
		graph.addEdge("AmazonFacebook", "Amazon", "Facebook",true);
		
		graph.addEdge("FacebookApple", "Facebook", "Apple",true);
		graph.addEdge("FacebookYoutube", "Facebook", "Youtube",true);
		graph.addEdge("FacebookBlogger", "Facebook", "Blogger",true);
		graph.addEdge("FacebookMicrosoft", "Facebook", "Microsoft",true);
		graph.addEdge("FacebookAmazon", "Facebook", "Amazon",true);
		graph.addEdge("Facebookbuap", "Facebook", "buap",true);
		graph.addEdge("Facebookforbes", "Facebook", "forbes",true);
		graph.addEdge("Facebooknexusmods", "Facebook", "nexusmods",true);
		
		graph.addEdge("githubYoutube", "github", "Youtube",true);
		graph.addEdge("githubnexusmods", "github", "nexusmods",true);
		graph.addEdge("githubFacebook", "github", "Facebook",true);
		
		graph.addEdge("cnnYoutube", "cnn", "Youtube",true);
		graph.addEdge("cnnFacebook", "cnn", "Facebook",true);
		graph.addEdge("cnnforbes", "cnn", "forbes",true);
		
		graph.addEdge("buapYoutube", "buap", "Youtube",true);
		graph.addEdge("buapFacebook", "buap", "Facebook",true);
		
		graph.addEdge("forbesYoutube", "forbes", "Youtube",true);
		graph.addEdge("forbesFacebook", "forbes", "Facebook",true);

		graph.addEdge("nexusmodsYoutube", "nexusmods", "Youtube",true);
		graph.addEdge("nexusmodsFacebook", "nexusmods", "Facebook",true);
		

		setNodesSizes(5,30,graph);
		 for (Node node : graph) {
		        node.addAttribute("ui.label", node.getId()); //Etiquetando cada nodo con su ID respectivo
		    }
		
		 graph.addAttribute("ui.stylesheet", styleSheet); //Agregando el estilo al grafo (Similar a CSS)
		 graph.addAttribute("ui.quality"); //Agregar calidad
		 graph.addAttribute("ui.antialias"); //Anti aliasing 
		Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);//graph.display();
		viewer.enableAutoLayout();

		ViewerPipe fromViewer = viewer.newViewerPipe(); //Visor del grafo
		fromViewer.addViewerListener(this); //Agregando un ViewerListener para obtener el grafo seleccionado
		fromViewer.addSink(graph);
		
		ViewPanel viewPanel = viewer.addDefaultView(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(viewPanel); //Juntanto las ventanas creadas
		panel.add(panel1,BorderLayout.PAGE_END);
		frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		
		while(loop) {
			fromViewer.pump(); 
		}
		
		
	}
	//Metodo para cambiar el tamaño de los nodos dependiendo de su grado, y agregar color.
	public void setNodesSizes(int minimumsize,int maximumsize,Graph graph){
		  int smaller = -1;
		  int greater = -1;
		  int smallin = -1;
		  int greaterin = -1;
		  Random rand = new Random(); 
		  
		  for(Node n:graph.getEachNode()){ 
		    if(n.getDegree() > greater || smaller == -1)
		      greater = n.getDegree();
		    if(n.getDegree() < smaller || greater == -1)
		      smaller = n.getDegree();
		    if(n.getInDegree() < smallin || greaterin == -1)
			      smallin = n.getInDegree();
		    if(n.getInDegree() > greaterin || smallin == -1)
			      greaterin = n.getInDegree()-4;
		  }
		  for(Node n:graph.getEachNode()){
			  int temp=10;
			  if(n.getInDegree()!=0) {
				  temp = (n.getInDegree()*10/greaterin);
				  if(temp > 10) {
					   
					  temp=9+rand.nextInt(2);
				  }
			  }
			  
			  n.addAttribute("PR",temp);
		    double scale = (double)(n.getDegree() - smaller)/(double)(greater - smaller);
		  if(null != n.getAttribute("ui.style")){
		     n.setAttribute("ui.style", n.getAttribute("ui.style") + " size:"+ Math.round((scale*maximumsize)+minimumsize) +"px;");
		     n.setAttribute("ui.style", "fill-color: rgb("+rand.nextInt(256)+","+rand.nextInt(256)+","+rand.nextInt(256)+");");
		  }
		  else{
		    n.addAttribute("ui.style", " size:"+ Math.round((scale*maximumsize)+minimumsize) +"px;fill-color: rgb("+rand.nextInt(256)+","+rand.nextInt(256)+","+rand.nextInt(256)+");");

		  }
		 }
		}
	
	public void viewClosed(String id) {
		loop = false;
	}

	//Metodo para al dar click regresar el PR del nodo seleccionado
	public void buttonPushed(String id) {
		int a = this.graph.getNode(id).getAttribute("PR");
		panel1.setTxt1(id);
		panel1.setTxt2(String.valueOf(a));
		//System.out.println("El PR de "+id+" es "+this.graph.getNode(id).getAttribute("PR"));
	}

	public void buttonReleased(String id) {
	}
	

	

	//Estilo del grafo tipo CSS
	protected String styleSheet =
			"graph {"+ 
			"fill-color: rgb(225,225,225);"+
			"padding: 40px;"+
			"}"+
            "node {" +   
            "z-index: 0;" +
            " size:40px;" + 
            " text-size:18px;" + 
            " fill-color:rgb(155,155,155);" + 
            " text-color:rgb(255,255,255);" + 
            " stroke-mode:plain;" + 
            " stroke-width:2px;" + 
            " stroke-color:#FFF8;"+
            "text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222;text-alignment: at-right;"+
            "}" +
            "edge {" + 
            "size:1px;" +
            "/*shape: freeplane;*/"+
            "/*shape:cubic-curve;*/" + 
            "/*shape:blob;*/"+
            "}";
	
}

	