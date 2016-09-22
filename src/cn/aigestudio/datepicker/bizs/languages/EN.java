package cn.aigestudio.datepicker.bizs.languages;

/**
 * 英文的默认实现类
 * 如果你想实现更多的语言请参考Language{@link DPLManager}
 *
 * The implementation class of english.
 * You can refer to Language{@link DPLManager} if you want to define more language.
 *
 * @author AigeStudio 2015-03-28
 */
public class EN extends DPLManager {
    @Override
    public String[] titleMonth() {
        return new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    }

    @Override
    public String titleEnsure() {
        return "Ok";
    }

    @Override
    public String titleBC() {
        return "B.C.";
    }

    @Override
    public String[] titleWeek() {
        return new String[]{"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};
    }
}
