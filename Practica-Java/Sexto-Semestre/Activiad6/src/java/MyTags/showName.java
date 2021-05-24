
package MyTags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;


/**
 *
 * @author alant
 */
public class showName extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
         out.println("Hola Mundo");      
        JspFragment f = getJspBody();
        if (f != null) {
            f.invoke(out);
        }
       
    }
    
}
