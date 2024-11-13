package com.bimoney.msvcnotifications.Tools.InternalSearch;

import nl.strohalm.cyclos.webservices.members.FieldValue;
import nl.strohalm.cyclos.webservices.members.Member;
import nl.strohalm.cyclos.webservices.members.MemberWebService;
import nl.strohalm.cyclos.webservices.members.Members;

public class UsersParametersSearch {

    public static void main(String[] args) {
        UsersParametersSearch user = new UsersParametersSearch();
        InternalSearch search = new InternalSearch();
        search.setUsername("5166582");
        search.setParameters("116");
        System.out.println(user.searchNit(search));
    }

    public String searchNit(InternalSearch search){
        Member memberResult = loadByUsername(search.getUsername());
        return memberResult.getFields().stream()
                .filter(fieldValue ->
                        fieldValue.getFieldId().toString().equals(search.getParameters()))
                .map(FieldValue::getValue)
                .findFirst()
                .orElse(null);
    }

    private static nl.strohalm.cyclos.webservices.members.Member loadByUsername(String username) {
        Members service = new Members();
        MemberWebService port = service.getMembersPort();
        return port.loadByUsername(username);
    }
}
