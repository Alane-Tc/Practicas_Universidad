
package MyTags;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author alant
 */
public class results extends SimpleTagSupport {
    StringWriter name = new StringWriter();
   
    @Override
    public void doTag() throws JspException, IOException {
        getJspBody().invoke(name);
        getJspContext().getOut().println("Soy "+name.toString()+ " Fecha: 18/03/2021");
        getJspContext().getOut().println(" Hora: 11:40");    
        JspFragment f = getJspBody();
    }
    
}
