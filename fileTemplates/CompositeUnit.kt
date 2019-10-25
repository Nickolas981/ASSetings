#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import ua.prom.izi.R
import com.example.compositeunit2.base.CompositeUnit

class ${NAME}CompositeUnit#if (${HANDLER} && ${HANDLER} != "") (override val handler: ${HANDLER}) #end : CompositeUnit {
    override val clazz: Class<*> = ${NAME}::class.java
    override val layoutId: Int = R.layout.${Item_Layout_ID}
}
