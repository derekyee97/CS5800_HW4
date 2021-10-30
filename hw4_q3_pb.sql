
CREATE TABLE public.Users (
                ID INTEGER NOT NULL,
                name VARCHAR(40) NOT NULL,
                CONSTRAINT id PRIMARY KEY (ID)
);
COMMENT ON TABLE public.Users IS 'User table for homework
';


CREATE TABLE public.Comments (
                ID_comment INTEGER NOT NULL,
                ID_USER INTEGER NOT NULL,
                text VARCHAR(400) NOT NULL,
                CONSTRAINT id PRIMARY KEY (ID_comment, ID_USER)
);


ALTER TABLE public.Comments ADD CONSTRAINT users_comments_fk
FOREIGN KEY (ID_USER)
REFERENCES public.Users (ID)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
