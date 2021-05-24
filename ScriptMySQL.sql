create table AgenciaViajes (
	nombre varchar(15) primary key,
	direccion varchar(50),
    aerolineas varchar(20)
);
create table Aeropuerto (
	nombre varchar(15) primary key,
    ciudad varchar(20)
);
create table Ticket (
	numero int primary key
);
create table Avion (
    modelo varchar(20),
    matricula varchar(8) primary key,
    aerolinea varchar(25),
	foreign key (aerolinea) references aerolinea(nombre)
);
create table Cliente (
	nombre varchar(15),
    alias varchar(25),
    apellido1 varchar(25),
    apellido2 varchar(25),
    direccion varchar(50),
    email varchar(25),
    dni varchar(9) primary key,
    contraseña varchar(25)
);
create table Asiento (
	nombre varchar(25) primary key,
	ocupado boolean,
	precio float,
    avion varchar(8),
    foreign key (avion) references Avion(matricula)
);
create table Aerolinea (
	nombre varchar(25) primary key
);
create table Aerolinea_aavv (
	aerolinea varchar(25),
    aavv varchar(15),
    foreign key (aerolinea) references aerolinea(nombre),
    foreign key (aavv) references agenciaViajes(nombre)
);
create table Vuelo (
	aerolinea varchar(25),
    fecha date,
    codVuelo int primary key,
    aeropuertoOrigen varchar(25),
    aeropuertoDestino varchar(25),
    avion varchar(8),
    foreign key (aerolinea) references Aerolinea(nombre),
    foreign key (avion) references Avion(matricula) 
);

insert into Cliente values('Pepe','Pepito','Castillo','Grande','Calle 1, pueblo 2','pepe@hotmail.com','12345678Z','1234')
