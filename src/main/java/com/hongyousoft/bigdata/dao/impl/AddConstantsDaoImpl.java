package com.hongyousoft.bigdata.dao.impl;

import com.hongyousoft.bigdata.dao.AddConstantsDao;
import com.hongyousoft.bigdata.util.GetStepId;
import org.pentaho.di.trans.step.StepMeta;
import org.pentaho.di.trans.steps.constant.ConstantMeta;
import org.springframework.stereotype.Repository;

@Repository
public class AddConstantsDaoImpl implements AddConstantsDao {


    @Override
    public StepMeta addConstants(String stepName, String[] fieldsName, String[] fieldsType,
                                 String[] fieldsValue) {

        //生成增加常量步骤
        ConstantMeta addConstantMeta = new ConstantMeta();
        addConstantMeta.setDefault();
        addConstantMeta.allocate(fieldsName.length);
        addConstantMeta.setFieldName(fieldsName);
        addConstantMeta.setFieldType(fieldsType);
        addConstantMeta.setValue(fieldsValue);
        // 给该步骤生成一个标识id
        String addConstantStepId = GetStepId.getStepId(addConstantMeta);
        // 添加增加常量步骤
        StepMeta addConstantStep = new StepMeta(addConstantStepId, stepName, addConstantMeta);
        addConstantStep.setLocation(100, 100);
        addConstantStep.setDraw(true);

        return addConstantStep;

    }
}
