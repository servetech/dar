DELETE FROM appointment;
DELETE FROM patient_status_changes;
DELETE FROM regimen_item_bridge;
DELETE FROM patient_condition;
DELETE FROM art_regimen;
DELETE FROM patientregistration;
DELETE FROM stock_control;
DELETE FROM regimen_group;
DELETE FROM regimen;
DELETE FROM item_group;
DELETE FROM item;
DELETE FROM patient_item;
DELETE FROM comment;
DELETE FROM archivelog;
DELETE FROM subscription;
DELETE FROM updatelog;
DELETE FROM district_id;
DELETE FROM encounter WHERE form_id !=223;
DELETE FROM encounter_value_archive;
DELETE FROM encounter_archive;
DELETE FROM outcome_archive;
DELETE FROM outcome;
DELETE FROM event;
DELETE FROM patient;
DELETE FROM problem;
DELETE FROM problem_archive;
DELETE FROM synclog;
