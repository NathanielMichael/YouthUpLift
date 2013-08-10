package org.battlehack.youthuplift.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class APIController
{
    public static final Log LOG = LogFactory.getLog(APIController.class);

    @RequestMapping("/")
    public String index(HttpServletResponse response) throws IOException
    {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Bryan & Tacos");
        }

        return "Tacos";
    }
}
