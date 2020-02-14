package lu.uni.snt.droidra.typeref.soot.methodrelated;

import com.google.common.base.Objects;
import org.apache.commons.lang3.StringUtils;

public class ParamTypesKey {

    /**
     *Comma separated string
     */
    public String paramTypes;

    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof ParamTypesKey)) {
            return false;
        }
        ParamTypesKey other = (ParamTypesKey) object;
        if (!StringUtils.equals(other.paramTypes, paramTypes)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.paramTypes);
    }
}