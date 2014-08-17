import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: loctar
 * Date: 14-8-2
 * Time: 下午2:43
 * To change this template use File | Settings | File Templates.
 */
public class EntityGenerator {
    public static  void  main(String[] args){
        Configuration     cfg  =new Configuration().configure();
        SchemaExport export = new SchemaExport(cfg);
        export.create(true,true);
    }
}
