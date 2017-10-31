--insert franco

INSERT INTO `provincia`(`id`, `nombre`) VALUES (NULL,"Rio Negro");

INSERT INTO `localidad`(`id`, `nombre`, `provincia_id`) VALUES (NULL,"Bariloche",1);

INSERT INTO `empresa`(`CUIT`, `email`, `nombre`, `razon_social`, `telefono`, `Localidad_id`) VALUES (123,"franco@gmail.com","franco","rs","telefono",1);
INSERT INTO `empresa`(`CUIT`, `email`, `nombre`, `razon_social`, `telefono`, `Localidad_id`) VALUES (124,"mauri@gmail.com","mauri","rs","telefono",1);
INSERT INTO `empresa`(`CUIT`, `email`, `nombre`, `razon_social`, `telefono`, `Localidad_id`) VALUES (125,"francisco@gmail.com","francisco","rs","telefono",1);


INSERT INTO `categoria`(`id`, `nombre`) VALUES (null,"cat");


INSERT INTO `establecimiento`(`id`, `direccion`, `fecha_carga`, `nombre`, `telefono`, `archivos_adjuntos`, `nro_RNE`, `vencimiento_RNE`, `nro_factura`, `Empresa_CUIT`, `Localidad_id`, `Categoria_id`) VALUES (null,"11 bis",STR_TO_DATE('2017-10-25', '%Y-%m-%d'),"casa franco",2302630505,null,"32132132",STR_TO_DATE('2020-10-25', '%Y-%m-%d'),123213,123,1,1);
