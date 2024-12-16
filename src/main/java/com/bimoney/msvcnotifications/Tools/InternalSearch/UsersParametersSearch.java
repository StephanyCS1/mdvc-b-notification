package com.bimoney.msvcnotifications.Tools.InternalSearch;

import nl.strohalm.cyclos.webservices.members.*;

import java.util.List;

public class UsersParametersSearch {
    private List<FieldValue> lista;
    Member result;


    public static void main(String[] args) {
        UsersParametersSearch user = new UsersParametersSearch();
        System.out.println(user.getValueByField("5166582", "13"));
    }


    public String getValueByField(String bimoneyCode, String campo) {
        result = new Member();
        result = loadByUsername(bimoneyCode);
        String respuesta = null;

        lista = result.getFields();
        for (FieldValue m : lista) {
            System.out.println(m.getDisplayName().toString() + " " +m.getFieldId().toString() );
            if (m.getFieldId().toString().equals(campo)) {
                respuesta = m.getValue();
            }
        }
        return respuesta;
    }


    public String getName(String bimoneyCode){
        result = new Member();
        result = loadByUsername(bimoneyCode);
        return result.getName().toUpperCase();
    }


    public String getEmail(String bimoneyCode){
        result = new Member();
        result = loadByUsername(bimoneyCode);
        return result.getEmail().toLowerCase();
    }


    public String getNit(String bimoneyCode){
        result = loadByUsername(bimoneyCode);
        return result.getFields().stream()
                .filter(fieldValue ->
                        fieldValue.getFieldId().toString().equals("15"))
                .map(FieldValue::getValue)
                .findFirst()
                .orElse(null);
    }


    //Cyclos
    private static MemberResultPage search(MemberSearchParameters params) {
        Members service = new Members();
        MemberWebService port = service.getMembersPort();
        return port.search(params);
    }

    private static Member loadByUsername(java.lang.String username) {
        Members service = new Members();
        MemberWebService port = service.getMembersPort();
        return port.loadByUsername(username);
    }

    private static Member loadByPrincipal(PrincipalParameters params) {
        Members service = new Members();
        MemberWebService port = service.getMembersPort();
        return port.loadByPrincipal(params);
    }
}
