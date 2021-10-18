package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author isenhome
 * @date 2021/10/18 17:27
 */
@Component
public class MysqlXxlJob {
    private static Logger logger = LoggerFactory.getLogger(SampleXxlJob.class);

    @XxlJob("mysqlJobHandler")
    public void mysqlJobHandler() throws Exception {

        XxlJobHelper.log("XXL-JOB, Start mysql job.");
        XxlJobHelper.getJobParam();


    }
}
