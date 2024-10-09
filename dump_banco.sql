--
-- PostgreSQL database dump
--

-- Dumped from database version 15.8
-- Dumped by pg_dump version 16.4

-- Started on 2024-10-09 00:18:15

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16564)
-- Name: tb_people; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_people (
    id bigint NOT NULL,
    age integer NOT NULL,
    cpf character varying(255) NOT NULL,
    email character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    password character varying(255) NOT NULL,
    phone character varying(255) NOT NULL
);


ALTER TABLE public.tb_people OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16563)
-- Name: tb_people_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_people_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.tb_people_id_seq OWNER TO postgres;

--
-- TOC entry 3327 (class 0 OID 0)
-- Dependencies: 214
-- Name: tb_people_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_people_id_seq OWNED BY public.tb_people.id;


--
-- TOC entry 3173 (class 2604 OID 16567)
-- Name: tb_people id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_people ALTER COLUMN id SET DEFAULT nextval('public.tb_people_id_seq'::regclass);


--
-- TOC entry 3321 (class 0 OID 16564)
-- Dependencies: 215
-- Data for Name: tb_people; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_people (id, age, cpf, email, name, password, phone) FROM stdin;
\.


--
-- TOC entry 3328 (class 0 OID 0)
-- Dependencies: 214
-- Name: tb_people_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_people_id_seq', 1, false);


--
-- TOC entry 3175 (class 2606 OID 16571)
-- Name: tb_people tb_people_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_people
    ADD CONSTRAINT tb_people_pkey PRIMARY KEY (id);


--
-- TOC entry 3177 (class 2606 OID 16573)
-- Name: tb_people uk_d2d7q2ilfl9yx9995aw37ukwh; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_people
    ADD CONSTRAINT uk_d2d7q2ilfl9yx9995aw37ukwh UNIQUE (cpf);


-- Completed on 2024-10-09 00:18:15

--
-- PostgreSQL database dump complete
--

