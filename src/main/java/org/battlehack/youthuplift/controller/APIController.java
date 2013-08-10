package org.battlehack.youthuplift.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.battlehack.youthuplift.model.Dummy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class APIController
{
    public static final Log LOG = LogFactory.getLog(APIController.class);

    @RequestMapping("/")
    public @ResponseBody
    Dummy index(HttpServletResponse response) throws IOException
    {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Bryan & Tacos");
        }

        Dummy dummy = new Dummy();
        dummy.setName("Bryan");
        dummy.setText("Tacos");

        return dummy;
    }
}
