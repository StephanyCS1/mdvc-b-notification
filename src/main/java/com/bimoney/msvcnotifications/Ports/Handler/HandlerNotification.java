package com.bimoney.msvcnotifications.Ports.Handler;

import com.bimoney.msvcnotifications.Ports.ExternalSearch.Request.CreateThirdParty;
import com.bimoney.msvcnotifications.Ports.In.NotificationDataEntry;
import com.bimoney.msvcnotifications.Ports.ExternalSearch.Request.ThirdPartyValidation;
import com.bimoney.msvcnotifications.Services.Implement.NotificationImplement;
import com.bimoney.msvcnotifications.Services.Implement.PlanillaImplement;
import com.bimoney.msvcnotifications.Tools.InternalSearch.UsersParametersSearch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Slf4j
@Service
public class HandlerNotification {

    Timer timer = null;

    @Autowired
    NotificationImplement notificationImplement;

    public void validations(NotificationDataEntry data) throws Exception {




        // Usar un Timer para ejecutar la tarea después de 10 segundos
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                try {

                } catch (Exception e) {
                    // Registrar el error en los logs para entender el fallo
                    log.info("Error al ejecutar la tarea programada: " + e.getMessage());
                    e.printStackTrace();
                } finally {
                    // Cancelar el Timer después de ejecutar la tarea
                    timer.cancel();
                }
            }
        };

        // Programar la tarea para que se ejecute después de 10 segundos
        timer.schedule(task, 10000);  // 10000 ms = 10 segundos
    }

    /**
     * Flujo para validar el tercero, de no existir se envia la creacion
     *
     * @param data
     * @return boolean
     * @throws Exception
     */
    public boolean ThirdPartyValidation(NotificationDataEntry data) throws Exception {
        String name = new UsersParametersSearch().getName(data.getFromMember());
        String phone = new UsersParametersSearch().getValueByField(data.getFromMember(), "8");
        String mail = new UsersParametersSearch().getEmail(data.getFromMember());
        ProcessExternalUser third = new ProcessExternalUser();
        boolean newThirdCreated = false;

        if (!third.thirdUserExist(new ThirdPartyValidation(data.getNodeidentificacion()))) {
            CreateThirdParty newThirdParty = new CreateThirdParty(
                    data.getNodeidentificacion(), name, phone, mail
            );
            newThirdCreated = third.createNewThirdParty(newThirdParty);
        }

        return newThirdCreated;
    }


}
